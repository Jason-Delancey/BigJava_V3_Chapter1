import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * Class that reads the user's name, then shows
 * a sequence of toe dialog boxes.
 * @author CloudStrife
 *
 */
public class DialogViewer4
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showInputDialog("What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");
		// TODO Auto-generated method stub

	}

}
