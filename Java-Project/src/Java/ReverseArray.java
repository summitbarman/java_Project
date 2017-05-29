package Java;

import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7};
		reverse(arr);
	}
	
	public static void reverse(int[] input)
	{
		System.out.println("Original Array is : "+Arrays.toString(input));
		
		if(input==null || input.length<=1)
			return;
		for(int i=0;i<input.length/2;i++)
		{
			int temp=input[i];
			input[i]=input[input.length-1-i];
			input[input.length-1-i]=temp;
		}
		System.out.print("Reversed Array is : "+Arrays.toString(input));
	}
}
