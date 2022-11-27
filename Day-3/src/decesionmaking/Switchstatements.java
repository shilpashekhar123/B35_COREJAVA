package decesionmaking;

import java.util.Scanner;

public class Switchstatements {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String num=s.next();
		
		//switch case to activate the caller-tune example
		switch(num)
		{
		case "1":
		{
			System.out.println("Kesariya");
			break;
		}
		case "2":
		{
			System.out.println("paramatma");
			break;
		}
		case "3":
		{
			System.out.println("hello hello");
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		s.close();
		}

	}
}
	
	
