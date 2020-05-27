package nooftimesinarray;

import java.util.Scanner;

public class Nooftimesinarray {
public static void main(String[] args)
	{
		int n, max, i, count=0;
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
	    System.out.println("The max element in the array is: "+max);
	    for(i=0;i<n;i++)
	    {
	    	if(array[i]==max)
	    	{
	    		count++;
	    	}
	    }
	     System.out.println("No of occurences of the max element: "+count);
	}
}
