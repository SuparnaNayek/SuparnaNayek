package com.example9.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.javasagedemo.demo.Entity.Topic;

@Service

public class DemoService {
	List<Topic> topicList = new ArrayList<>(Arrays.asList(
			new Topic("1","java","basic course of" ),
			new Topic("400", "python","detail course structure")
			));
	public String  getName() {
		return "hello";
	}
	
	public List<Topic> getTopics(){
		
		return topicList;
	}
	
	public   Topic  getTopicData(String id ) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		
	}

	public void  addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicList.add(topic);
	}
//pdate
	public void updateTopic(Topic topic, String id ) {
		// TODO Auto-generated method stub
		for(int i = 0; i<topicList.size(); i++) {
			Topic t = topicList.get(i);
			if(t.getId().equals(id)) {
				topicList.set(i, t);
			}
		}
		
	}
//delete
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicList.removeIf(t -> t.getId().equals(id));
		
	}
	
	
}

}
