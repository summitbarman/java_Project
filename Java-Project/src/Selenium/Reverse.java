package Selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse 
{
	public static void main(String[] args) throws IOException 
	{
	/*	
		//One Way To Reverse the String
		String input="";
		System.out.println("Enter your String : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		input=br.readLine();
		char[] str=input.toCharArray();
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}
		System.out.println();
	*/	
		//Second Way to Reverse The String
		String text="SUMIT BARMAN";
		StringBuilder sb=new StringBuilder();
		sb.append(text);
		sb=sb.reverse();
		System.out.print(sb);
	}
}
