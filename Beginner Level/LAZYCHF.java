import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class LAZYCHF
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x=sc.nextInt(), m=sc.nextInt(), d=sc.nextInt();
		    System.out.println(Math.min((x*m),(x+d)));
		}
	}
}