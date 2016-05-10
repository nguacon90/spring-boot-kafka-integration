package vn.com.nguacon.kafka.producer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer implements Producer {
	private Logger log = Logger.getLogger(KafkaProducer.class);
	
	private MessageChannel toKafka;
	
	@Autowired
	public KafkaProducer(@Qualifier("toKafka") MessageChannel toKafka) {
		this.toKafka = toKafka;
	}
	
	@Override
	public void send(String message) {
		Message<?> content = new GenericMessage<String>(message);
		toKafka.send(content);
		log.info(String.format("payload: %s", content.getPayload()));
	}
}
