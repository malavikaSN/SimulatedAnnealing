package sa;

/*
* City.java
* Information on cities.
*/

public class City {
    private int x;
    private int y;
    private String cityID;            

    // Constructor that creates a city with its ID and x, y coordinates
	public City(String cityID, int x, int y){
    	this.cityID = cityID;
        this.x = x;
        this.y = y;
    }            
        
    /**
	 * @return x
	 */
	public int getX() {
		return x;
	}

	
	/**
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	
	/**
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	
	/**
	 * @return cityID
	 */
	public String getcityID() {
		return cityID;
	}

	
	/**
	 * @param cityID
	 */
	public void setcityID(String cityID) {
		this.cityID = cityID;
	}
	
}