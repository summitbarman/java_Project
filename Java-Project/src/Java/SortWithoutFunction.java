package Java;

import java.util.ArrayList;
import java.util.List;

public class SortWithoutFunction 
{
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(5);
		a.add(1);
		a.add(9);
		a.add(7);
		a.add(6);
		System.out.print("Before sorting : ");
		System.out.print(a+"\n");
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a.size()-i-1;j++)
			{
//				if(a.get(j)<a.get(j+1)) // this is for descending order.
				if(a.get(j)>a.get(j+1)) // this is for ascending Sort.
				{
					int temp=a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
			}
		}
		System.out.print("Elements after Sorting : ");
		System.out.println(a);
	}
}
