package Java;

import java.util.Scanner;

public class OccurrenceFinding 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String  : ");
        String str=sc.nextLine().toLowerCase();
        System.out.println("Enter Character to Count : ");
        char ch=sc.next(".").toLowerCase().charAt(0);
        int count=0;
        for(char charCount:str.toCharArray())
        {
        	if(ch==charCount)
        	{
        		count++;
        	}
        }
        System.out.println(ch+" occurs "+count+" times in "+str);
        sc.close();
    }
}
