package sorting;

import java.util.Scanner;

public class InsertionSort {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			int pivot = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>pivot)
				{
				arr[j+1] = arr[j];
				j--;
				}
			arr[j+1] = pivot;
			
			System.out.println("After iteration" );
			for(int x=0;x<n;x++)
				System.out.print(arr[x] + " ");
			
		}
		
		System.out.println("Sorted sequence: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	}
	
}
