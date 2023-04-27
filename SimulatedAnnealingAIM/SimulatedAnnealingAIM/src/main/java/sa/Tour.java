package sa;

import java.util.ArrayList;
import java.util.Collections;

/*
* Tour.java
* Models the travelling salesman tour.
*/

public class Tour{

    // Tour of cities
    private ArrayList<City> tour = new ArrayList<City>();
    
    // Set initial value of distance to 0 
    private int distance = 0;


    // Constructor that initialises an empty tour
    public Tour(){
        for (int i = 0; i < TourManager.numberOfCities(); i++) {
            tour.add(null);
        }
    }
    
    // Constructor that starts a tour from another tour
    @SuppressWarnings("unchecked")
	public Tour(ArrayList<City> tour){
        this.tour = (ArrayList<City>) tour.clone();
    }
    
    
    /**
      @return tour
     */
    public ArrayList<City> getTour(){
        return tour;
    }
     
    
    /**
     * Creates a random tour (Individual or Candidate solution)
     */
    public void generateIndividual() {
        // Loop through all destination cities and add them to the tour
        for (int cityIndex = 0; cityIndex < TourManager.numberOfCities(); cityIndex++) {
          setCity(cityIndex, TourManager.getCity(cityIndex));
        }
        // Randomly reorder the tour
        Collections.shuffle(tour);
    }

    
    /**
     * Returns a city with the specified index from the tour
     * @param index
     * @return city at specified index
     */
    public City getCity(int index) {
        return tour.get(index);
    }

    
    /**
     * Sets a city in a certain position within a tour
     * @param index
     * @param city
     */
    public void setCity(int index, City city) {
        tour.set(index, city);
        distance = 0;
    }
    
    
    /**
     * Computes the total distance of the tour
     * @return total distance of the tour
     */
    public int getTotalDistance(){
    	if (distance == 0) {
            int tourDistance = 0;
            
            // Loop through our tour's cities
            for (int cityIndex=0; cityIndex < tourSize(); cityIndex++) {
                City fromCity = getCity(cityIndex);
                City destinationCity;
                
                // If at the last city of tour, initialise destinationCity to first city of tour
                if(cityIndex+1 < tourSize()){
                    destinationCity = getCity(cityIndex+1);
                }
                else{
                    destinationCity = getCity(0);
                }  
                
                tourDistance += Utility.distance(fromCity, destinationCity); 
            }
            distance = tourDistance;
        }
        return distance;
    }

    
    /**
     * Get number of cities on the tour
     * @return size
     */
    public int tourSize() {
        return tour.size();
    }
    
    
    @Override
    /**
     * Prints out the list for all cities in the tour
     * @return s string of list of cities in the tour
     */
    public String toString() {
        String s = getCity(0).getcityID();
        for (int i = 1; i < tourSize(); i++) {
            s += " -> " + getCity(i).getcityID();
        }
        return s;
    }
}
