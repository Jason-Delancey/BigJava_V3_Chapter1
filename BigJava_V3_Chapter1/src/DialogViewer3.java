import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * Modified DialogViewer class that prints "Hello, name!" to the console, displaying the name that the user typed in
 * @author CloudStrife
 *
 */
public class DialogViewer3
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		System.exit(0);
		// TODO Auto-generated method stub

	}

}
