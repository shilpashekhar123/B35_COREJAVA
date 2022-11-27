package constructordemo;

public class employee {
	public int salary;
	public String name;
	//default constructor
	employee()
	{
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
		
	}
	//method
	public void print()
	{
		System.out.println("The salary of "+name+" is: "+salary);
	}

}
