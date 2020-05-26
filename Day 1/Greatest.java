package Greatest;

import java.util.Scanner;

public class Greatest 
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a =s.nextInt();
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the value of b: ");
		b =t.nextInt();
		if(a>b)
		{
			System.out.println("A is greatest");
		}
		else
		{
			System.out.println("B is greatest");
		}

	}
}
