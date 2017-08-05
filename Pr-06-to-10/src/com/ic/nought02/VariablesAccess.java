package com.ic.nought02;

public class VariablesAccess
{

	int x = 10;

	class InnnerClass
	{
		int x = 100;

		public void m1()
		{
			int x = 1000;

			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			// System.out.println("InnerClass.this.x = "+InnerClass.this.x);
			// //How Durga Sir can be wrong
			System.out.println("VariablesAccess.this.x = " + VariablesAccess.this.x);
		}
	}

	public static void main(String[] args)
	{
		new VariablesAccess().new InnnerClass().m1();
	}
}