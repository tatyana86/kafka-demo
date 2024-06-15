package ru.krivonogova.kafka_demo.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	@GetMapping("/test")
	public String start() {
		
		return "I'm working, and you?";
	}
	
}
