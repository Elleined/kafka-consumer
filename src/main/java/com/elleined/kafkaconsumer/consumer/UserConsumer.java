package com.elleined.kafkaconsumer.consumer;

import com.elleined.kafkaconsumer.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserConsumer {

    @Value("${spring.kafka.topic.userTopic}")
    private String userTopic;

    @KafkaListener(
            topics = "${spring.kafka.topic.userTopic}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumeUser(User user) {
        log.debug("User {} received from topic {}", user, userTopic);
    }
}
