package com.demo.task;

import java.util.Date;

public class taskOne implements Runnable{
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void run() {
		System.out.println("������ȣ���ǰʱ��Ϊ��" + new Date());
	}

	  
}
