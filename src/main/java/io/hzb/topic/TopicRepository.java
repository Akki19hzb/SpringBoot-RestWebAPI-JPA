package io.hzb.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
//Topic is the name of the Entity Class(1st Parameter)
	//String is the type of the primary key in the entity class(Eg. String id)2nd Parameter	
}
