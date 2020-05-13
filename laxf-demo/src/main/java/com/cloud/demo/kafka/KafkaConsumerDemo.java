package com.cloud.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author : dx
 * @date : 2020/5/12
 * Description :
 */
@Component
public class KafkaConsumerDemo {
    @KafkaListener(topics = "testTopic")
    public void onMessage(String message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println(message);
    }
}
