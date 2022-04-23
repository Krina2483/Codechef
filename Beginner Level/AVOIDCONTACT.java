import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class AVOIDCONTACT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int n=x-y;
		    if(y==0)
		    System.out.println(x);
		    else if(n==0)
		    System.out.println(y+(y-1));
		    else
		    System.out.println((2*y)+n);
		}
	}
}