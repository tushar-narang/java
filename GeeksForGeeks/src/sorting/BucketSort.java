package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BucketSort {


	public static void bucketSort(float arr[], int n)

	{

	// 1) Create n empty buckets

	HashMap<Integer,ArrayList<Float>> b=new HashMap<Integer,ArrayList<Float>>(n);

	// 2) Put array elements in different buckets

	for (int i=0; i<n; i++)
	{
		int bi=(int) (n*arr[i]);
				if(b.containsKey(bi))
					b.get(bi).add(arr[i]);
				else
				{
					ArrayList<Float> al=new ArrayList<Float>();
					al.add(arr[i]);
					b.put(bi,al);
				}

	}

	// 3) Sort individual buckets

	for (int i:b.keySet()){

	Collections.sort(b.get(i));

	}

	// 4) Concatenate all buckets into arr[]

	int index = 0;

	for (int i:b.keySet())

	for (int j = 0; j < b.get(i).size(); j++)

	arr[index++] = b.get(i).get(j);

	}

	/* Driver program to test above funtion */

	public static void main(String[] args)

	{

	//float arr[] = { 0.897f, 0.565f, 0.656f,0.655f, 0.1234f,0.1235f, 0.665f, 0.3434f};
	float arr[] = {1.4f,1.2f,1.1f,1.9f};
	int n = arr.length;

	bucketSort(arr, n);

	System.out.println("Sorted array is \n");

	for (int i=0; i<n; i++)
		System.out.print(arr[i]+ " ");
	}
}
