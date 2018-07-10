package io.hzb.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;


	public List<Topic> getTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().
		forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		Optional<Topic> optional =topicRepository.findById(id);
		if (optional.isPresent()) {
		    Topic topic = optional.get();
		    return topic;
		}
		else {
		   return null;
		}
		
	}

	public void add(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void update(Topic topic, String id) {
		topicRepository.save(topic);
	}

	public void delete(String id) {
		topicRepository.deleteById(id);
		
	}

	
}

