package io.hzb.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
//Topic is the name of the Entity Class(1st Parameter)
	//String is the type of the primary key in the entity class(Eg. String id)2nd Parameter	
	/*
	// Declare the method with FindByProperty name format , and Spring Data JPA will take care of it
	public List<Course> findByName(String name);//return list of course having name as passed in parameter name
	public List<Course> findByDescription(String foo);// return list of course having Description as passed in parameter foo
	public List<Course> findByTopic(String name);// would have worked if the type of property Topic was string 
	*/
	
	public List<Course> findByTopicId(String topicId);
	
	//return a list of Courses having a particular Topic id 
	//Here the id property of Type of Topic is being searched
}

