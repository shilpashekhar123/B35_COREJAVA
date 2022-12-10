package tns.india;

public class variablearguments {
	
	public static void print(int a,int b,String...s)
	{
		System.out.println(a+""+b);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}

	public static void main(String[] args) {
		print(12,25,"java","springboot","html");
	

	}

}
