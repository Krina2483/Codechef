import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class HOOPS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt ();
		
		while (t-- > 0)
		{
		    int n = sc.nextInt ();
		    
		    int h = (n / 2) + 1;
		    
		    System.out.println (h);
		}
		
		sc.close ();
	}
}

