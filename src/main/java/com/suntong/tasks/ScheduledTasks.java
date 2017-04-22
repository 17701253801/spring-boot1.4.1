package com.suntong.tasks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import com.suntong.service.StudentSerivce;

/**
 * 定时任务启动
 * @author suntong
 *
 */
//@Component
public class ScheduledTasks {
	/**日志打印*/
	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);
	
	@Autowired
	StudentSerivce serviceStu;
	
	@Scheduled(fixedRate=1000*60*3)
	public void reportCurrentTime(){
		LOGGER.info("定时任务3分钟");
		serviceStu.testStudent("3");
	}
	
	@Scheduled(fixedRate=1000*60*2)
	public void restTasks2(){
		LOGGER.info("定时任务2分钟");
		serviceStu.testStudent("2");
	}
	
	
	@Scheduled(fixedRate=1000*60)
	public void restTasks1(){
		LOGGER.info("定时任务1分钟");
		serviceStu.testStudent("1");   
	}
}
