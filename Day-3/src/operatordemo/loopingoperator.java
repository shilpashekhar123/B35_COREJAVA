package operatordemo;

import java.util.Scanner;

public class loopingoperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of age and weight:");
		int age=s.nextInt();
		int weight=s.nextInt();
		//to donate the blood age>18 and weight>50
		boolean result1=(age>18)&&(weight>50);
		boolean result2=(3==5)||(53>50);
		boolean result3= !(age==weight);
		System.out.println("the result is: "+result1);
		System.out.println("the result is: "+result2);
		System.out.println("the result is: "+result3);
		s.close();

	}
}
