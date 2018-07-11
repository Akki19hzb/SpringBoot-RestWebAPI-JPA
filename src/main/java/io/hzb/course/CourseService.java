package io.hzb.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;


	public List<Course> getCourses(String topicId) {
		//return topics;
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).
		forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		Optional<Course> optional =courseRepository.findById(id);
		if (optional.isPresent()) {
		    Course course = optional.get();
		    return course;
		}
		else {
		   return null;
		}
		
	}

	public void add(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void update(Course course) {
		courseRepository.save(course);
	}

	public void delete(String id) {
		courseRepository.deleteById(id);
		
	}

	
}

