package week3.day1;

public class InterfaceImpl implements LearnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnInterface li = new InterfaceImpl();
		
		li.sampleMethod();
		li.sampleMethod1();
		}

	@Override
	public void sampleMethod() {
		// TODO Auto-generated method stub
		System.out.println("SAMPLEMETHOD" + num );
	}

	@Override
	public void sampleMethod1() {
		// TODO Auto-generated method stub
		System.out.println("SAMPLEMETHOD1");
		
	}

}
