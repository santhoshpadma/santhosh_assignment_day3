package asssignment3;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of array elements :");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" array element");
			a[i]=s.nextInt();
		}
		s.close();
		System.out.println("Entered Array elements are :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}
		int temp=a[0];
		for(int i=1;i<n;i++) 
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
		System.out.println("Biggest number in a given array is: "+temp);
	}

}
