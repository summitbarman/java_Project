package Java;

import java.util.Scanner;

public class SortString 
{
	public static void main(String[] args) 
	{
		char temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String text=sc.nextLine();
		char[] chars=text.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			for(int j=0;j<chars.length;j++)
			{
				if(chars[j]>chars[i])
				{
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			}
		}
		for(int k=0;k<chars.length;k++)
		{
			System.out.print(chars[k]);
		}
	}
}
