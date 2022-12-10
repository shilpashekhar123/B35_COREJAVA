package tns.india;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][]arr= {{11,12},{6,9},{8,81}};
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);
		
		System.out.println("Array element are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+"");
			}
			System.out.println();
			
		}
	}

}
