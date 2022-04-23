import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class NOTIME
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt (), h = sc.nextInt (), x = sc.nextInt ();
		int[] t = new int[n];
		int i;
		String s = "NO";
		
		for (i = 0; i < n; i++)
		{
		    t[i] = sc.nextInt ();
		    if (x + t[i] >= h)
		    {
		        s = "YES";
		    }
		}
		System.out.println (s);
	}
}
