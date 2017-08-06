package com.ic.nought03;

public class NormalRunnable
{
	public static void main(String[] args)
	{
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();

		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main thread");
		}
	}
}

class MyRunnable implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}