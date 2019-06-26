package week1.day1;

public class Car {

	String[] carModels = {"audi","bmw","tata","nano","maruti"};
	
	public void carModel() {
		for(String eachModel : carModels) {
			System.out.println(eachModel);
		}
		
		/*for(int i = 0; i < 3; i++) {
		System.out.println(carModels[i]);
		}*/
		
	}
	
	
	
	int numberOfWheels = 4;
	// access return methodName
	public String getColor(String brand) {
		if (brand.equals("maruti") || brand.equals("bmw")) {
			System.out.println();
			return "red";
		}else if (brand.equals("tata")) {
			System.out.println();
			return "blue";
		}/*else {
			return "white";
		}*/
		return "white";
	}
	public void applyBrake() {
		System.out.println("brake applied");
	}
	public int changeGear() {
		return 2;
	}
	public void getRegNumber(String brand) {
		switch (brand) {
		case "maruti": System.out.println("1001");
		break;
		case "ford": System.out.println("1002");
		break;
		case "tata": System.out.println("1003");
		break;
		case "bmw": System.out.println("1004");
		break;
		case "audi": System.out.println("1005");
		break;
		default:
			break;
		}
	}
	public void printOddNumbers() {
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				System.out.println(i);				
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
















