package sumofevenodd;

import java.util.Scanner;

public class Sumofevenodd {
	
	public static void main(String[] args)
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a =s.nextInt();
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the value of b: ");
		b =t.nextInt();
		if((a+b)%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
			
	}

}
