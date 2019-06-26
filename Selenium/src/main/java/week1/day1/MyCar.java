package week1.day1;

public class MyCar {

	
	public static void main(String[] args) {
		// To call a class
		// ClassName reference = new ClassName();
		Car c = new Car();
		c.carModel();
		// To call a method
		// reference.methodName();
		String color = c.getColor("maruti");
		System.out.println(color);
		int numberOfWheels = c.numberOfWheels;
		System.out.println(numberOfWheels);
		c.getRegNumber("tata");
		c.printOddNumbers();
	}
	
	
	
	
	
	
	

}



