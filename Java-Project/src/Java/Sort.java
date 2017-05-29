package Java;

import java.util.Arrays;

public class Sort 
{
	public static void main(String[] args) 
	{
		int arr1[]=new int[]{3,5,1,6,4,9,8};
		System.out.print("Original Array is : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		System.out.println();
		Arrays.sort(arr1);
		System.out.print("After Sorting The arry looks like : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		
		//partially sorted array
		int[] arr2=new int[]{3,5,1,6,4,9,8};
		Arrays.sort(arr2,6,9);
		System.out.print("Partially Sorted Array : ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
