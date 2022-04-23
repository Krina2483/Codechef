import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class DISCUS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int x;
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    x=(a>b)?(a>c?a:c):(b>c?b:c);
		    System.out.println(x);
		}
	}
}