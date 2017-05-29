package Java;

import java.util.Scanner;

public class ReverseStringStringBuilder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb=sb.reverse();
		System.out.println(sb);
	/*	
		for(int i=0;i<sb.length();i++)
		{
			System.out.print(sb.charAt(i));
		}
	*/
	}
}
