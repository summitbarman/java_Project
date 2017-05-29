package Java;

import java.util.Scanner;

public class ReplaceWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string=sc.nextLine();
		
		System.out.println("Enter a word to be replaced : ");
		String replace=sc.next();
		
		System.out.println("Enter a word which it is to be replaced : ");
		String replaceWith=sc.next();
		
		string=string+" ";
		String newsen="",temp="";
		for(int i=0;i<string.length();i++)
		{
			char x=string.charAt(i);
			if(x!=' ')
			{
				temp=temp+x;
			}
			else
			{
				if(replace.equals(temp))
				{
					newsen=newsen+replaceWith;
				}
				else
				{
					newsen=newsen+temp;
				}
				newsen=newsen+" ";
				temp="";
			}
		}
		System.out.println("The New Sentence is "+newsen);
	}
}
