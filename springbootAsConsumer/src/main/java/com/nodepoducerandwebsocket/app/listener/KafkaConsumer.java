package com.nodepoducerandwebsocket.app.listener;

import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Service
public class KafkaConsumer {

    @KafkaListener(topics= "test-topic", groupId= "group_id")
    public void consumeNodemsgs(String message){
	System.out.println("Consumed msgs from Node :"+message);        
    }

}
