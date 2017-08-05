package com.ic.nought03;

public class NormalThreading
{

	public static void main(String[] args)
	{
		MyThread thread = new MyThread();
		thread.start();

		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}

class MyThread extends Thread
{

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Child thread");
		}
	}
}