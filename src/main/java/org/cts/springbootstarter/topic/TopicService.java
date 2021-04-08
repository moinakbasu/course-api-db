package org.cts.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	protected List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	protected Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	protected void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	protected void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	protected void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
