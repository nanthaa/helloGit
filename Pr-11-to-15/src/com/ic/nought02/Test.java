package com.ic.nought02;

public class Test
{

	int i = 10;
	static int j = 20;

	public static void main(String[] args)
	{
		new Test().new InnerClass().m1();
	}

	class InnerClass
	{
		public void m1()
		{
			System.out.println("i::" + i);
			System.out.println("y::" + j);
		}
	}

}