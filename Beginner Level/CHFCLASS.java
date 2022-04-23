import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFCLASS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    if(n%7==6)
		    System.out.println((n/7)+1);
		    else
		    System.out.println(n/7);
		}
	}
}
