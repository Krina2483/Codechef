import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class MINDAYSRET
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n%k==0)
                System.out.println(n/k);
            else
                System.out.println(n/k+1);
        }
	}
}
