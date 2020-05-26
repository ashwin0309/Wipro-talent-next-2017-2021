package Positiveno;
import java.util.Scanner;


public class Positiveno {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		n =s.nextInt();
		if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("Zero");
		}
		
		
	}

}
