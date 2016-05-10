# spring-boot-kafka-integration

## Description
This project is simple application which using spring boot integration kafka. Kafka design is single node - single broker.

## Build
* mvn clean install

## Environment
* java 8
* apche kafka 0.8.2.2
* zookeeper 3.3.1

## How to install
1. Install kafka and zookeeper
2. Start server kafka and zookeeper: 
	* `reference: http://kafka.apache.org/07/quickstart.html` 
3. Run application:
	* `mvn spring-boot:run`