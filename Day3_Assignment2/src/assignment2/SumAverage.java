package assignment2;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of array elements :");
		int n=s.nextInt();
		int sum=0;
		float avg;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" array element");
			a[i]=s.nextInt();
		}
		s.close();
		
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		avg=(float) sum/n;
		System.out.println("SUM= "+sum);
		System.out.println("Average=  "+avg);
	}

}
