import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,l;
	    for(i=100;i<=500;i++)
	    {
	        l=i*i;
	        if(l%21==0 && l%36==0 && l%66==0)
	        {
	            System.out.print(l);
	            break;
	        }
	    }
	   }
