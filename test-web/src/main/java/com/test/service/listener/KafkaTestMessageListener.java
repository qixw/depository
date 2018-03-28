package com.test.service.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：KafkaTestMessageListener
 * @date ：2018/3/28 15:04
 */
public class KafkaTestMessageListener implements MessageListener<String,String> {


	@Override
	public void onMessage(ConsumerRecord<String,String> record) {

		String value = record.value();
		System.out.println("接收到kafka的消息是:"+value);
	}
}
