package com.niros.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=  new ArrayList<>(Arrays.asList(new Topic("Spring","Springframework","Springframework discription"),
			new Topic("Spring2","Spring2framework","Springframework2 discription")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
				
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<=topics.size(); i++) {
			
			Topic t =topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}
}
