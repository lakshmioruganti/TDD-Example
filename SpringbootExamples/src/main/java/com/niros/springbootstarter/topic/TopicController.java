package com.niros.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/toppics")
    public List<Topic> getAllTopics() {
			
		return 	topicService.getAllTopics();	
	}
	
	@RequestMapping("/toppics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/toppics")
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/toppics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id ) {
		topicService.updateTopic(id,topic);
		return;
	}
}
