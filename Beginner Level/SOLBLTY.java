import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SOLBLTY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    System.out.println((a+((100-x)*b))*10);
		}
	}
}