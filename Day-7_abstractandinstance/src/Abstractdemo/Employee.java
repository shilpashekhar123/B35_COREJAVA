package Abstractdemo;

public class Employee {

	private int ID;
	public Employee(String name, String gender,int id) {
		super();
		ID=id;
		// TODO Auto-generated constructor stub
	}
	public void work() {

		if(ID>0)
		{
			System.out.println("Employee Exist");
		}
		else
		{
			System.out.println("Not Exist");
		}
	}
}
