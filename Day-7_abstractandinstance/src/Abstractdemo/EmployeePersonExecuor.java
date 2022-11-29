package Abstractdemo;

public class EmployeePersonExecuor {

	public static void main(String[] args) {
		Employee p1=new Employee("basu","Male",22);
		Employee p2=new Employee("shilpa","Female",-6);
		
		//to return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();


	}

}
