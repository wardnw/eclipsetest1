package jan14;

public class vehicleExample {

	private int passengers;
	private int fuelCapacity;
	private int mpg;
	private int range;
	
	public int getPassengers(){
		return passengers;
	}
	
	public int getFuelCapacity(){
		return fuelCapacity;
	}
	
	private int getMpg(){
		return mpg;
	}
	
	public void setPassengers(int passengers){
		this.passengers = passengers;
	
	}
	
	public void setFuelCapacity(int fuelCapacity){
		this.fuelCapacity = fuelCapacity;
	}
	
	public void setMpg(int mpg){
		this.mpg = mpg;
	}
	
	public int getRange(){
		return range;
	}
	
}
