package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept 
{
	public static void main(String[] args) 
	{
		/*List<String> list=new ArrayList<>();
		list.add("amrit");
		list.add("samar");
		list.add("preeti");
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}*/
		try
		{
			int a=10;
			int b=20;
			int c=0;
			c=a/0;
		}
		catch(ArithmeticException e1)
		{
			System.out.println("It's a "+e1);
		}
		catch(Exception e)
		{
			System.out.println("This is not possible 2nd time");
		}
		
		
		
	}
}
