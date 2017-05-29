package Java;

public class StringBufferBuilder 
{
	public static void main(String[] args) 
	{
	/*	
		StringBuffer buffer=new StringBuffer("hello ");
		buffer.append("java");
		System.out.println(buffer);
	*/
	/*	
		StringBuilder builder=new StringBuilder("Hello ");
		builder.append("java");
		System.out.println(builder);
	*/
		long startTime=System.currentTimeMillis();
		StringBuffer buffer=new StringBuffer("java ");
		for(int i=0;i<10000;i++)
		{
			buffer.append("language");
		}
		System.out.println("Time Taken By StringBuffer: "+(System.currentTimeMillis()-startTime)+" ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder builder=new StringBuilder("Oracle ");
		for(int i=0;i<10000;i++)
		{
			builder.append("10g");
		}
		System.out.println("Time taken by StringBuilder: "+(System.currentTimeMillis()-startTime)+" ms");
	}
}
