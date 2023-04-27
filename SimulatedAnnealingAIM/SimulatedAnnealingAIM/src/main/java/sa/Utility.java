package sa;

import java.util.Random;

import sa.City;

/*
* Utility.java
* Formulas in aid of the mathematical calculations involved in the
* Simulated Annealing algorithm computation.
*/

public class Utility {


	/**
	 * Computes the Euclidean distance between two cities
	 * @param city1
	 * @param city2
	 * @return distance the distance between city1 and city2
	 */
	public static double distance(City city1, City city2){
		int xDistance = city1.getX() - city2.getX();
		int yDistance = city1.getY() - city2.getY();
		double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );

		return distance;
	}
		
	/**
	 * Calculates the acceptance probability
	 * @param currentDistance the total distance of the current tour
	 * @param newDistance the total distance of the new tour
	 * @param temperature the current temperature
	 * @return value probability of whether to accept the new tour
	 */
	public static double acceptanceProbability(int currentDistance, int newDistance, double temperature) {
		// Accept new solution if it is better
		if (newDistance < currentDistance) {
			return 1.0;
		}
		// Calculate acceptance probability if new solution is worse
		return Math.exp((currentDistance - newDistance) / temperature);
	}

	
	/**
	 * Computes random number r if 0.0 <= r <= 1.0
	 * @return r
	 */
	static double randomDouble()
	{
		Random r = new Random();
		return r.nextInt(1000) / 1000.0;
	}
	
	
	/**
	 * Returns random integer value within a given range
	 * The minimum value of range is inclusive, maximum value is not inclusive [min, max)
	 * @param min 
	 * @param max 
	 * @return d random integer value between min and max [min,max)
	 */ 
	public static int randomInt(int min , int max) {
		Random r = new Random();
		double d = min + r.nextDouble() * (max - min);
		return (int)d;
	}
}
