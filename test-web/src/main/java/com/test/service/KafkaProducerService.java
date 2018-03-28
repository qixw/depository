package com.test.service;

import java.util.Map;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：KafkaProducerService
 * @date ：2018/3/28 14:06
 */
public interface KafkaProducerService {

	public void sendMQ(Map map);
}
