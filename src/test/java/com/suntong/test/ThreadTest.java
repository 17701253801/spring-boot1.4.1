package com.suntong.test;

import java.util.concurrent.CountDownLatch;

public class ThreadTest{
	public static void main(String[] args) {
		test();
	}
	public static void test(){
		StringBuilder t = new StringBuilder();
		int threadCount = 1000;
		CountDownLatch tDownLatch = new CountDownLatch(threadCount);
		for (int i = 0; i < threadCount; i++) {
			Thread thread = new Thread(new Test1(t, tDownLatch));
			thread.start();
		}
		
		try {
			tDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.toString());
	}
}

class Test1 implements Runnable{
	
	private StringBuilder t;
	private CountDownLatch countDown ;
	
	public Test1(StringBuilder strBulider,CountDownLatch countDownLatch) {
		// TODO Auto-generated constructor stub
		this.t = strBulider;
		this.countDown = countDownLatch;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			t.append(""+i);
		}
		countDown.countDown();
	}
		
}