package com.demo.task;

import java.util.Date;

public class taskOne implements Runnable{
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void run() {
		System.out.println("任务调度，当前时间为：" + new Date());
	}

	  
}
