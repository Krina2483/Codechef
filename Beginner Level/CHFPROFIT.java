import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFPROFIT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    System.out.println(Math.abs((x*y)-(x*z)));
		}
	}
}
