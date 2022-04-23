import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFRUN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int m =0;m<t;m++)
		{
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int x3 = sc.nextInt();
		    int v1 = sc.nextInt();
		    int v2 = sc.nextInt();
		    double a =(double) Math.abs(x1-x3)/v1;
		    double b =(double) Math.abs(x2-x3)/v2;
		    if(a>b)
		    {
		        System.out.println("Kefa");
		    }
		    else if (a<b)
		    {
		        System.out.println("Chef");
		    }
		    else
		    {
		        System.out.println("Draw");
		    }
		    
		   
		}
	}
}