package Java;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		/*
		 // String Palindrome 
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String to check : ");
		String text=sc.nextLine();
		for(int i=text.length()-1;i>=0;--i)
		{
			rev+=text.charAt(i);
		}
		if(rev.equalsIgnoreCase(text))
		{
			System.out.println(rev+" is Palindrome");
		}
		else
			System.out.println(rev+" is not Palindrome");
		*/
		// Number Palindrome
		int rem,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to Check : ");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(" is palindrome");
		}
		else
			System.out.println(" is not palindrome");
		
	}
}
