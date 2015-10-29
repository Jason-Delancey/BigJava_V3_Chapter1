/**
 * 
 */

/**
 * Prints a tic-tac-toe board
 * @author CloudStrife
 *
 */
public class TicTacToeBoardPrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/* Create the ceiling */
		System.out.println("+" + "---" + "+" + "---" + "+" + "---" +"+");
		
		/* Create 3 rows, including the floor */
		for(int i = 0; i < 3; i++)
		{
			System.out.println("|" + "   " + "|" + "   " + "|" + "   " + "|");
			System.out.println("+" + "---" + "+" + "---" + "+" + "---" +"+");
		}

	}

}
