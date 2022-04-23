import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRICECON
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		
		int t = sc.nextInt ();
		
		while (t-- > 0)
		{
		    int n = sc.nextInt (), k = sc.nextInt ();
		    int[] p = new int[n];
		    int i;
		    int sum = 0, sumFinal = 0;
		    
		    for (i = 0; i < n; i++)
		    {
		        p[i] = sc.nextInt ();
		        
		        sum = sum + p[i];
		        
		        if (p[i] > k)
		        {
		            sumFinal = sumFinal + k;
		        }
		        else if (p[i] <= k)
		        {
		            sumFinal = sumFinal + p[i];
		        }
		    }
		    
		    System.out.println (sum - sumFinal);
		}
	}
}
