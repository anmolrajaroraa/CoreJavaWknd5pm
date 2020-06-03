package oops;

abstract class Account{
	long accountNumber;
	String customerName;
	
	int withdraw() {
		System.out.println("Withdraw called...");
		return 10000;
	}
	void deposit() {
		System.out.println("Deposit called...");
	}
	
	abstract void ROI();
	
	final void KYC() {
		System.out.println("Aadhar / PAN card should be registered with the account");
	}
}

// final keyword means this thing is now constant

// abstract means no object creation is possible (applying control)
// abstract says that you need to inherit me and then instantiate the child class
// in order to utilize me

// private cons says no object creation from outside the class
// singleton classes uses the process of creating an object from inside the class and return it to outside world
// inheritance also stops coz child class is not able to access cons

// if parent fn is not abstract -
// then you have 3 choices in child class
// use the parent fn as it is
// override the parent fn it it seems out dated or has shortcomings but the signature should remain same
// but in a case we can change the return type if return types are covariant
// keep both ways - parent way as well as introduce a new way

// final abstract class ABC{
// }
// class XYZ{
//}

// final class ABC{
//  abstract void x(){
//  }
// }


class SavingsAccount extends Account{
	int withdraw() {
		return 10000;
	}
	void ROI() {
		System.out.println("4% interest will be given...");
	}
	void limit() {
		System.out.println("Limit has been breached...");
	}
	void showPAN() {
		System.out.println("Please show PAN card...");
	}
	void eKYC() {
		
	}
	void KYC(int documents) {
		
	}
//	@Override
//	void KYC() {
//		// TODO Auto-generated method stub
//		
//	}
}
class CurrentAccount extends Account{

	@Override
	void ROI() {
		
		
	}

//	@Override
//	void KYC() {
//		System.out.println("Aadhar AND PAN should be registered");
//		
//	}
	
}

final class Math{
	final double PI = 3.14;
	
	void squareRoot() {
		
	}
	void cubeRoot() {
		
	}
	void power() {
		
	}
	void abs() {
		
	}
}

//class MathAdvanced extends Math{
//	
//}

public class OOPSDemo {

	public static void main(String[] args) {
//		Account account = new Account();
//		account.accountNumber = 100;
//		account.customerName = "XYZ";
//		account.deposit();
//		account.withdraw();
		
//		System system = new System();
		
		SavingsAccount sa = new SavingsAccount();
		sa.accountNumber = 101;
		sa.customerName = "Ram";
		sa.KYC();
		sa.eKYC();
		sa.KYC(2);
		sa.deposit();
		sa.ROI();
		sa.withdraw();
		
		CurrentAccount ca = new CurrentAccount();
		ca.KYC();
		
		Math math = new Math();
	}

}

// Inheritance (IS-A)
// Embedding of objects (HAS-A)

class Loan{
	
}
class HomeLoan extends Loan{
	
}
class AutoLoan extends Loan{
	
}
class Customer{
	// Customer is a Loan
	// Customer has a Loan
	HomeLoan homeLoan;
	AutoLoan autoLoan;
}
