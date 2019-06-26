package week3.day1;

public class SBIBank implements RBI, CIBIL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIBank sbibank = new SBIBank();
		sbibank.aadharMandatory();
		sbibank.setTransactionLimit();
		sbibank.getCreditScore();
	}

	@Override
	public void getCreditScore() {
		// TODO Auto-generated method stub
		System.out.println("Credit Score");
		
	}

	@Override
	public void setTransactionLimit() {
		// TODO Auto-generated method stub
		System.out.println("Set TransactionLinit");
		
	}

	@Override
	public void aadharMandatory() {
		// TODO Auto-generated method stub
		System.out.println("AAdhar Mandatory");
		
	}

}
