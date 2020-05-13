package com.cloud.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @author : dx
 * @date : 2020/5/12
 * Description :
 */
@RestController
@RequestMapping("/demos")
public class KafkaProducerDemo {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/message/send")
    public boolean send(@RequestParam String message) {
        kafkaTemplate.send("testTopic", message);
        return true;
    }

}
