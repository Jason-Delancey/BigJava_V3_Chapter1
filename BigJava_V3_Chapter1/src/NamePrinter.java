import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * Program that displays your name inside a box on the console screen.
 * @author CloudStrife
 *
 */
public class NamePrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/* Get a name and use the # of char in the name to determine the number of dashes to use
		 * for the roof and ceiling*/
		String aName = JOptionPane.showInputDialog("What is your name?");
		int roof = aName.length();
		int ceiling = roof;
		
		/* Create the ceiling of the frame */
		System.out.print('+');
		for(int i = 0; i < aName.length(); i++)
		{
			System.out.print('-');
		}
		System.out.println('+');
		
		/* Create the middle of the frame */
		System.out.println('|' + aName + '|');
		
		/* Create the floor of the frame */
		System.out.print('+');
		for(int i = 0; i < aName.length(); i++)
		{
			System.out.print('-');
		}
		System.out.println('+');
	}

}
