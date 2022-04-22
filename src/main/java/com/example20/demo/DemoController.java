package com.example20.demo;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javasagedemo.demo.Entity.Topic;
import io.javasagedemo.demo.service.DemoService;

@RestController

public class DemoController {
	@Autowired
	public DemoService demoService;
	
	@RequestMapping("/helloPage")
	public String getName() {
//		DemoService d = new DemoService(); // tightly coupling 
		return demoService.getName();
		
	}
	
	@RequestMapping("/greeting")
	public   List<String> getGreeting() {
		return Arrays.asList("good morning", "hello", "good even");
	}
	
	@RequestMapping("/topics")
	public   List<Topic> getTopic() {
//		return Arrays.asList("good morning", "hello", "good even");
	return demoService.getTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public    Topic   getTopicData(@PathVariable String id ) {
		return demoService.getTopicData(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public   void  addTopic(@RequestBody Topic topic) {
		 demoService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public   void  updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
		 demoService.updateTopic(topic, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public   void  updateTopic( @PathVariable String id   ) {
		 demoService.deleteTopic( id);
	}
	

}


