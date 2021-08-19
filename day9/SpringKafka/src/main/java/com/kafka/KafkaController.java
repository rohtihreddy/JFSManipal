package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonDeserializer;

@RestController
public class KafkaController {
	
	
	private static final String Kafka_Topic= "TelstraProjectTopic";
	
	@Autowired
	//KafkaTemplate<String, Player> kafkaTemplate;
	KafkaTemplate<String, Student> kafkaTemplate;
	
	private Player createStarPlayer() {
		Player player = new Player();
		player.setAlias("Rinku");
		player.setName("Rohan");
		player.setMaxSpeed(24);
		player.setTeam("Telstra 5G");
		return player;
	}
	
	private Student addStudent() {
		Student student = new Student();
		student.setsDept("CSE");
		student.setsId(17529);
		student.setsName("Nikhil");
		return student;
		
	}
	
	@PostMapping("/publish")
	
	public String publishToKafka(@RequestParam String data) {
		//Player starPlayer = createStarPlayer();
		Student getStudent = addStudent();
		
		try {
			//kafkaTemplate.send(Kafka_Topic,starPlayer);	
			kafkaTemplate.send(Kafka_Topic,getStudent);	
		} catch (Exception e) {
			//e.printStackTrace();
			return "Error while publishing";
		}
		
		//return "The data "+starPlayer.toString()+" is published succesfully to Kafka";
		return "The data "+getStudent.toString()+" is published succesfully to Kafka";
		
		}
	@KafkaListener(id="hello",topics =Kafka_Topic)
	/*public void listenToTopicData(Player player) {
		System.out.println(player.toString());
	}*/
	public void listenToTopicData(Student student) {
		System.out.println(student.toString());
	}
}
