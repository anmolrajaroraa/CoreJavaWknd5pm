package oops2;

class BB{
	void withdrawal() {
		checkPIN(1234);
		checkBalance(10000);
		eKYC();
		checkTransactionsLimit();
	}
	void checkPIN(int PIN) {
		
	}
	void checkBalance(int amount) {
		
	}
	void eKYC() {
		
	}
	void checkTransactionsLimit() {
		
	}
}

public class Test {

	public static void main(String[] args) {
		
		BB obj = new BB();
		obj.withdrawal();

	}

}
