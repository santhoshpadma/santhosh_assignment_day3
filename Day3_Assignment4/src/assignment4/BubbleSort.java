package assignment4;

import java.util.Scanner;

public class BubbleSort {

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
		System.out.println("Array elements Before sorting are :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}
		int temp;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array elements After sorting are :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}
	}
}




