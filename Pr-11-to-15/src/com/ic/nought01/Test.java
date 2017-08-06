package com.ic.nought01;

public class Test
{

	public static void main(String[] args)
	{
		Test t = new Test();// First way to create Inner class object. Sample
							// change to merge in GIT
		InnerTest test = t.new InnerTest();
		test.test();

		Test.InnerTest i = new Test().new InnerTest();// Second way to create
														// Object of Inner class
		i.test();

		new Test().new InnerTest().test(); // Third way to call method test()

	}

	public void outerTest()
	{

		InnerTest inner = new InnerTest(); // Here we have Test() class object
											// available,
											// So we can directly create Object
											// of Inner class
		inner.test();
	}

	class InnerTest
	{
		static final int i = 0; // Important

		public void test()
		{
			System.out.println("test method of InnerTest class");
		}
	}

}
