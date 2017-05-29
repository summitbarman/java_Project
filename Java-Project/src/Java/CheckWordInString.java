package Java;

import java.util.Arrays;
import java.util.Scanner;

public class CheckWordInString 
{
	public static void main(String[] args) 
	{
	/*	
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		System.out.print("Enter a String : ");
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter a Word to Check : ");
		String word=sc1.nextLine();
		String[] splited=string.split("\\b+");
		Arrays.asList(splited).contains(word);
	*/
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter word to search : ");
	    String s1=sc1.nextLine();
//	    String []p=s.split("\\s*(=>|,|\\s)\\s*");
	    String []p=s.split("\\s");
	        for(int i=0;i<p.length;i++)
	        {
	            if(s1.equals(p[i]))
	            {
	                System.out.println("yes! "+p[i]+" is Present in the String");
	            }

	        }
	}
}
