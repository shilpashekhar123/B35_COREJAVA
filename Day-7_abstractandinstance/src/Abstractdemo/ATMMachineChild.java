package Abstractdemo;

public class ATMMachineChild extends ATMMachine{

	//provided the implementation to abstarct method of parent class
	@Override
	void withdraw() {
		
		int balance=500000;
		System.out.println("Withdrawing amount is: "+balance);
		
	}

}
