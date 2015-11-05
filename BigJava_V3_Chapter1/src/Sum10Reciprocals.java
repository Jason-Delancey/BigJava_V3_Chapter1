import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */

/**
 * Computes the sum of the reciprocals 1/1.....1/10
 * @author CloudStrife
 *
 */
public class Sum10Reciprocals
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final Logger log = Logger.getLogger( Sum10Reciprocals.class.getName() );
		final double numerator = 1;
		int denominator = 1;
		double sum = 0;
		for(int i = 1; i < 11; i++)
		{
			sum += numerator/denominator;
			denominator++;
			i++;
			log.log(Level.INFO, "The sum is " + sum);
		}

	}

}
