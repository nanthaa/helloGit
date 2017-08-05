package com.ic.nought03;

public class AnonymousInnerClass
{

	public static void main(String[] args)
	{
		PopCorn corn = new PopCorn();
		corn.taste();

		PopCorn corn2 = new PopCorn()
			{
				public void taste()
				{
					System.out.println("Spicy");
				}
			};
		corn2.taste();

		PopCorn corn3 = new PopCorn()
			{
				public void taste()
				{
					System.out.println("Sweet");
				}
			};
		corn3.taste();

		System.out.println(corn.getClass().getSimpleName());
		System.out.println(corn2.getClass().getName());// getSimpleName() won't
														// work here because it
														// don't
		System.out.println(corn3.getClass().getName());// have any simple name,
														// it is anonymous
	}
}