package sa;

import java.util.ArrayList;

import sa.City;

/*
* TourManager.java
* Contains and keeps track of the cities of a tour.
*/


public class TourManager {

    // Contains the cities
    private static ArrayList<City> destinationCities = new ArrayList<City>();

    
    /**
	 * Adds a city
	 * @param city
	 */
	public static void addCity(City city) {
		destinationCities.add(city);
	}

	/**
	 * @param index
	 * @return city at specified index 
	 */
	public static City getCity(int index){
		return (City)destinationCities.get(index);
	}

	
	/**
	 * @return size the number of destination cities
	 */
	public static int numberOfCities(){
		return destinationCities.size();
	}
    
}