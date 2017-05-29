package Java;

public class MissingNumberInArray 
{
	public void missingnos(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;i++)
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
			System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
			System.out.println(b[i]);
		}
		int d[]=new int[a.length];
		d=b;
		int missing=0;
		for(int i=0;i<b.length;i++)
		{
			if(a[i]!=d[i])
			{
				missing=a[i];
				break;
			}
		}
		System.out.println();
		System.out.print(missing);
	}
	public static void main(String[] args) 
	{
		MissingNumberInArray a2=new MissingNumberInArray();
		int a[]={1,4,3,5,6};
		int b[]={4,1,5,3};
		a2.missingnos(a, b);
	}
}
