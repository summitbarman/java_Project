package Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		Pattern p=Pattern.compile("(\\d)");
		Matcher m=p.matcher(str);
		while(m.find())
		{
			System.out.print(m.group(1));
		}
	}
}
