import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SUNDAY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int b=8+n;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]%7==0 || a[i]%7==6)
		        {
		            b=b-1;;
		        }
		    }
		    System.out.println(b);
		}
	}
}
