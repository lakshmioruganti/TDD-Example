package com.niros.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{
	
	

}
