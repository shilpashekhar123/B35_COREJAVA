package classdemo;

import java.util.Scanner;

public class classandobjectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the car:");
		int speed=s.nextInt();
		
		//creation of object
		car obj=new car();
		
		//compile time input
		//obj.speed=45;
		obj.speed(speed);
		s.close();

	}

}
