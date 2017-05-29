package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintduplicateChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String text=sc.nextLine();
		char[] arr=text.toCharArray();
		Map<Character,Integer> chCount=new HashMap();
		for(Character c:arr)
		{
			if(chCount.containsKey(c))
			{
				int count=chCount.get(c);
				count++;
				chCount.put(c, count);
				if(count>=2)
				{
					System.out.println(c);
				}
			}
			else
			{
				chCount.put(c, 1);
			}
		}
	}
}
