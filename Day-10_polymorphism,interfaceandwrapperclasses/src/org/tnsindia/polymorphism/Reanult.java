package org.tnsindia.polymorphism;
//Demo on Constructor overloading
public class Reanult {
	public String model;
	public String engine;
	
	//Constructor overloading
	//parameterized constructor
	Reanult(String model,String engine)
	{
		System.out.println("Model name is: "+model+" "+
				"Engine is: "+engine);
	}
	//parameterized constructor
	Reanult(String model)
	{
		System.out.println("Model name is: "+model);
	}

}