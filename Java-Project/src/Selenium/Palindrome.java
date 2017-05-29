package Selenium;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
	
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String text=sc.nextLine();
		for(int i=text.length()-1;i>=0;--i)
		{
			rev=rev+text.charAt(i);
		}
		if(rev.equalsIgnoreCase(text))
		{
			System.out.println(text+" is Palindrome");
		}
		else
		{
			System.out.println(text+" is not Palindrome");
		}
		sc.close();
	}
}
