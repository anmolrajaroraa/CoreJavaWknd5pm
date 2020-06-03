package oops2;

interface Loan{
	int max_interest = 15;
	public abstract void roi();
	void emi();
	void approve();
}

abstract class CommonLoan implements Loan{
	public void approve() {
		System.out.println("Check credit score...");
	}
}

class HomeLoan extends CommonLoan{

	@Override
	public void roi() {
		System.out.println("10% interest");
	}

	@Override
	public void emi() {
		System.out.println("emi for 15 years");
	}
	
}

class AutoLoan extends CommonLoan{

	@Override
	public void roi() {
		System.out.println("12% interest");
	}

	@Override
	public void emi() {
		System.out.println("emi for 5 years");
	}
	
}

class EducationLoan extends CommonLoan{

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emi() {
		// TODO Auto-generated method stub
		
	}
	
}

class PersonalLoan extends CommonLoan{

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emi() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.approve();
		homeLoan.emi();
		homeLoan.roi();
		
		AutoLoan autoLoan = new AutoLoan();
		autoLoan.approve();
		autoLoan.emi();
		autoLoan.roi();

	}

}
