import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class IPCCERT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		int count=0;
		while(n-->0)
		{
		    int ans=0;
		    for(int i=0;i<k;i++)
		        ans+=s.nextInt();
		    int q=s.nextInt();
		    if(ans>=m&&q<=10)
		        count++;
		        
		}
		System.out.println(count);
	}
}