import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SAVWATER
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	for(int m =0;m<t;m++)
	{
	    int h = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int c = sc.nextInt();
	    if(h*(x+(y/2))<=c)
	    {
	        System.out.println("YES");
	    }
	    else
	    {
	        System.out.println("NO");
	    }
	}
	}
}