package io.yadnyesh.kksball.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AsyncService {
	Logger logger = LoggerFactory.getLogger(AsyncService.class);
	
	@Async
	public Future<String> process() throws InterruptedException {
		logger.info("###Start Processing with Thread id: " + Thread.currentThread().getId());
		Thread.sleep(2000);
		String processInfo = String.format("Processing is Done with Thread id= %d", Thread.currentThread().getId());
		return new AsyncResult<>(processInfo);
	}
	
}
