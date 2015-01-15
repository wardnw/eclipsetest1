package jan14;
import java.util.Scanner;


public class display {

	Scanner scan = new Scanner(System.in);
	
	private vehicleExample v;
	
	
	private void getInputs(){
		System.out.println("Enter the seating capacity of the vehicle");
		v.setPassengers(scan.nextInt());
		System.out.println("Enter the fuel capacity");
		v.setFuelCapacity(scan.nextInt());
		
	}
	
	private display(){
		v = new vehicleExample();
	}
	
	private void getOutput(){
		System.out.println("Your vehicle can hold " + v.getPassengers() + "and has a range of " + v.getRange());
	}
	
}
