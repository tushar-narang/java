package sorting;

import java.util.Random;
import java.util.Scanner;

public class RandomisedQuickSortUsingGoodPivot {

	public static int partition(int[] arr, int l, int r)
	{
		System.out.println("Enter partition " + l + " " + r);
		int pivot = arr[l];
		int i = l-1;
		int j = r+1;
		
		while (true) {
			 
	        // Find leftmost element greater than
	        // or equal to pivot
	        do {
	            i++;
	        } while (arr[i] < pivot);
	 
	        // Find rightmost element smaller than
	        // or equal to pivot
	        do {
	            j--;
	        } while (arr[j] > pivot);
	 
	        // If two pointers met.
	        if (i >= j)
	            return j;
	 
	        //swap(arr[i], arr[j]);
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
		   
	}
	
	public static void sort(int[] arr, int l,int r)
	{
		Random random = new Random();
		if(l < r)
		{
		//int rval = l + random.nextInt(r-l);
		//System.out.println(l + " " + r + " Gen random: " + rval);
		//swap arr[l] with arr[rval]
		int rval = GoodPivot.getGoodPivot(arr, l, r);
		int temp = arr[l];
		arr[l] = arr[rval];
		arr[rval] = temp;
		
		System.out.print("Before partition: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		int p = partition(arr, l, r);
		
		System.out.print("After Partition: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		System.out.println("");
		sort(arr, l, p);
		sort(arr, p+1, r);
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int l=0, r=n-1;
		sort(arr,l,r);
		
		System.out.println("Sorted sequence: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	}
}
