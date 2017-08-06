package com.ic.nought03;

public class AnonymousRunnable
{

	public static void main(String[] args)
	{

		Runnable runnable = new Runnable()
			{
				@Override
				public void run()
				{
					for (int i = 0; i < 10; i++)
					{
						System.out.println("Child Thread");
					}
				}
			};

		Thread t = new Thread(runnable);
		t.start();

		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}