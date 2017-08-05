package net.nanthaa.nought.one;

public class HelloMiddleEarth
{

	public static void main(String[] args)
	{
		String names[] = { "Anand", "Nanthaa", "Saran", "Shyam", "Vicky" };

		// print greetings to the fine folks in the Middle Earth
		for (String name : names)
		{
			System.out.format("Hello, %s! \n", name);
			System.out.println(" How are u doing today ? ");
		}
		
	}

}
