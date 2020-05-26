package Evenorodd;

import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		n =s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
			
	}
}
