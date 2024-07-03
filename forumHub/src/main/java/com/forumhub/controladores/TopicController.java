package com.forumhub.controladores;

import com.forumhub.entidades.Topic;
import com.forumhub.servicos.TopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class TopicController {
    private TopicService topicService;

    @PostMapping
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        Topic newTopic = topicService.saveTopic(topic);
        return ResponseEntity.ok(newTopic);
    }

    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics() {
        List<Topic> topics = topicService.getAllTopics();
        return ResponseEntity.ok(topics);
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Topic>> getTopicsByCourse(@PathVariable Long courseId) {
        List<Topic> topics = topicService.getTopicsByCourse(courseId);
        return ResponseEntity.ok(topics);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Topic>> getTopicsByUser(@PathVariable Long userId) {
        List<Topic> topics = topicService.getTopicsByUser(userId);
        return ResponseEntity.ok(topics);
    }

}
