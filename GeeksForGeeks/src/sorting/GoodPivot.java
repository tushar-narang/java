package sorting;

import java.util.Arrays;

public class GoodPivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		printArray(arr);
		System.out.println("got val: " + getGoodPivot(arr, 0, arr.length-1) + "");
	}
	
	public static int getGoodPivot(int arr[], int low, int high) {
		
		int goodPivot = goodPivot(arr, low, high);
		System.out.println("Good Pivot: " + goodPivot);
		
		int j=0;
		for (j = 0; j < arr.length; j++)
			if (arr[j] == goodPivot) {
				return j;
				}
		return -1;
		
	}
	
	public static int goodPivot(int arr[], int low, int high)
	{
		int n = high - low + 1;
		int i, median[] = new int[(n + 4) / 5];

		for (i = 0; i < median.length - 1; i++) {
			median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + 5), 5);
		}

		if (n % 5 == 0) {
			median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + 5), 5);
			i++;
		} else {
			median[i] = getMedian(Arrays.copyOfRange(arr, 5 * i + low, 5 * i + low + (n % 5)), n % 5);
			i++;
		}

		int medOfMed = i == 1 ? median[i - 1]
				: goodPivot(median, 0, i - 1);

		System.out.println("got median:" + medOfMed);
		
		
		return medOfMed;
	}
	
	private static int getMedian(int arr[], int n) {
		System.out.println("find median: ");
		printArray(arr);
		//mergeSort(arr, 0, arr.length - 1);
		Arrays.sort(arr);
		return arr[n / 2];
		
	}

	

	private static void printArray(int[] arr) {
		System.out.println("");
		System.out.println("TestSort.printArray()");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	private static int findRank(int[] arr, int i, int j, int r)
//	{
//		if(j-i+1 >5)
//		{
//			int p = goodPivot(arr, i, j);
//			int temp = arr[i];
//			arr[i] = p;
//			
//		}
//	}

}
