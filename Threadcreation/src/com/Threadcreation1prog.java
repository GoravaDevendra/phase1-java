package com;

public class Threadcreation1prog {
	public static void main(String[]args) {
		Thread1 t1=new Thread1();
		t1.start();
	}
}
class Thread1 extends Thread
{
	
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("creating thread");
		}
		
	}
}

	



