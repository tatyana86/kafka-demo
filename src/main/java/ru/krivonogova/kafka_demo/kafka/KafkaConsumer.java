package ru.krivonogova.kafka_demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	
	@KafkaListener(topics = "test", groupId = "my_consumer")
	public void listen(String message) {
		log.info("Recieved message: {}", message);
	}

}
