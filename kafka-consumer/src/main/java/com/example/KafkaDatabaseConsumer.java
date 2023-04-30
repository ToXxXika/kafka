package com.example;


import com.example.Entities.RedditData;
import com.example.Repository.RedditDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {
  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
    private RedditDataRepository dataRepository ;

    public KafkaDatabaseConsumer(RedditDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

  @KafkaListener(topics = "Reddit_recentchange", groupId = "group_id")
    public void consume(String message) {
        LOGGER.info("Message received from kafka: {}",message);
      RedditData redditData = new RedditData();
        redditData.setRedditEventData(message);
        dataRepository.save(redditData);
    }
}
