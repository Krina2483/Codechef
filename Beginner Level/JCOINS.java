import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class JCOINS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    System.out.println((10*x)+(5*y));
		}
		
	}
}