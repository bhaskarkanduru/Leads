package assignmentweek1.day1;

public class MyCalculator {

	public static void main(String[] args) {
		//int input1;
		//int input2;
		Calculator cc = new Calculator();
		int sum = cc.add(4, 6);
		System.out.println(sum);
		
		int diff = cc.sub(8, 3);
		System.out.println(diff);
		
		int mult = cc.multiply(4, 3);
		System.out.println(mult);
		
		int quotient = cc.div(12, 3);
		System.out.println(quotient);

	}

}
