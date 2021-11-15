package testing;

public class JunitTesting 
{

	/**
	 *  Method counts all how many 'a' or 'A' characters are in a word.
	 * @param word
	 * @return int
	 */
	public int counting(String word)
	{
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A')
			{
				count++;
			}
		}
		
		return count;
	}

	
	/**
	 * Method squares a given number.
	 * @param x
	 * @return int
	 */
	public int squareing(int x)
	{
		return x*x;
	}
	
	/**
	 * Method divides b into a.
	 * @param a
	 * @param b
	 * @return double
	 */
	public double division(int x, int y)
	{
		return x / y;
	}
	
	
}
