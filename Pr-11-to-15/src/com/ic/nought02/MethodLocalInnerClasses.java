package com.ic.nought02;

public class MethodLocalInnerClasses
{

	public void m1()
	{
		class Inner
		{
			public void sum(int x, int y)
			{
				System.out.println("Sum::" + (x + y));
			}
		}

		Inner i = new Inner();

		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}

	public static void main(String[] args)
	{
		MethodLocalInnerClasses classes = new MethodLocalInnerClasses();
		classes.m1();
	}
}
// Very rarely used concept. Requires when you need specific functionality
// inside method.
// If we can declare Inner class inside instance method then from that method
// local inner class
// we can access both static and non-static members of outer class directly.
// If we declare inner class inside static method, then we can access only
// static member from that
// method local inner class.