package vn.com.nguacon.kafka.consumer;

public interface Consumer extends Runnable {
	void receive();
}
