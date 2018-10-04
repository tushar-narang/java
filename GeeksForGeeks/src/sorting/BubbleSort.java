package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted sequence: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	
	sc.close();
	}
}
