package net.prod.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedditChangesProducer {
 private static final Logger LOGGER = LoggerFactory.getLogger(RedditChangesProducer.class);
 private KafkaTemplate<String,String> kafkaTemplate ;

 public RedditChangesProducer(KafkaTemplate<String,String> kafkaTemplate){
     this.kafkaTemplate= kafkaTemplate;
 }
 public void sendMessage(){
     String topic ="Reddit_recentchange";
     //to read real time stream data from reddit , we use event source
 }
}
