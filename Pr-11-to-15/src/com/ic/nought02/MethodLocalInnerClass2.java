package com.ic.nought02;

public class MethodLocalInnerClass2
{

	public void m1()
	{
		int x = 20;

		class InnerClass
		{
			void test()
			{
				// System.out.println("x = "+x);
			}
		}
	}

	public static void main(String[] args)
	{

	}
}
/*
 * From method local inner class we can't access local variables of method until
 * we make them final. Reason is that final variable are replaced with its
 * values at the compile time. The only applicable modifiers for method local
 * inner classes are Final, abstract, Sttrictfp. If we are trying to apply any
 * other modifiers then we will get compile time error.
 */