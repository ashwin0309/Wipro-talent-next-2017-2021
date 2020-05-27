package maxarray;
import java.util.Scanner;

public class Maxarray {
	
	public static void main(String[] args)
	{
		int n, max ,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of elements in the array:");
		n = s.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		max=array[0];
		for(i=0;i<n;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
	    System.out.println(max);
	}
  
}
