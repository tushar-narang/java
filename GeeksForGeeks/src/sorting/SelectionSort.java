package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int min_idx = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] < arr[min_idx])
					min_idx = j;
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
			System.out.print("After iteration" );
			for(int x=0;x<n;x++)
				System.out.print(arr[x] + " ");
			System.out.println("");
			
		}
		
		System.out.println("Sorted sequence: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	}
	
}
