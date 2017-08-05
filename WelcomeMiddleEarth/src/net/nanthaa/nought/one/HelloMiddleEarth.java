package net.nanthaa.nought.one;

public class HelloMiddleEarth
{

	// print greetings to the fine folks in the Middle Earth
	public static void main(String[] args)
	{
		String names[] = { "Anand", "Nanthaa", "Saran", "Shyam" };

		for (String name : names)
		{
			System.out.format("Hello, %s! \n", name);
		}

	}

}
