import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class MARARUN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
		    int D=s.nextInt();
		    int d=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    if(D*d>=42) System.out.println(C);
		    else if(D*d>=21) System.out.println(B);
		    else if(D*d>=10) System.out.println(A);
		    else System.out.println(0);
		}
	}
}