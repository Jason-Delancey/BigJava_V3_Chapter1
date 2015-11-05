import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */

/**
 * Computes the sum of the first ten positive integers.
 * @author CloudStrife
 *
 */
public class Sum10
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final Logger aLog = Logger.getLogger(Sum10.class.getName());
		int sum = 0;
		for(int i = 0; i < 11; i++)
		{
			sum += i;
			aLog.log(Level.INFO, "sum is " + sum);
		}

	}

}
