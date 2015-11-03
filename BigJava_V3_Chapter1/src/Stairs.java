/**
 * 
 */

/**
 * Class that makes steps depending on the number of flights of steps given
 * @author CloudStrife
 *
 */
public class Stairs
{
	private int n, steps, roof, wall;

	/**
	 * Constructor that needs to accept a number of flights of steps
	 * @param numStairs The number of flights of steps
	 */
	Stairs(int numStairs)
	{
		steps = numStairs;
		n = 0;
		roof = n+1;
		wall = n+2;
	}

	/**
	 * Main method of the class that makes the flights of steps using helper methods
	 */
	public void makeSteps()
	{
		while (n < steps)
		{
			makeRoof(roof);
			makeWalls(wall);
			n++;
			roof++;
			wall++;
		}
		makeRoof(n);
	}

	/**
	 * This helper method makes the walls between each block of steps
	 * 
	 * @param wall
	 *            The amount of walls to make between each block of steps
	 */
	private void makeWalls(int wall)
	{
		int temp = wall;
		while (temp > 0)
		{
			System.out.print("|");
			System.out.print("   ");
			temp--;
		}
		System.out.print("\n");
	}

	/**
	 * This helper method makes the roof for each block of steps
	 * 
	 * @param roof
	 *            The amount of roofs to make for each block of steps
	 */
	private void makeRoof(int roof)
	{
		int temp = roof;
		while (temp > 0)
		{
			System.out.print("+");
			System.out.print("---");
			temp--;
		}
		System.out.print("+\n");
	}
}
