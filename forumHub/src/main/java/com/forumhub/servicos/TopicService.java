package com.forumhub.servicos;

import com.forumhub.entidades.Topic;
import com.forumhub.repositorios.TopicRepository;

import java.util.List;

public class TopicService {
    private TopicRepository topicRepository;

    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public List<Topic> getTopicsByCourse(Long courseId) {
        return topicRepository.findByCourseId(courseId);
    }

    public List<Topic> getTopicsByUser(Long userId) {
        return topicRepository.findByUserId(userId);
    }
}
