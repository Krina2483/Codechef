import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class FBC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n--!=0){
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    System.out.println(k-x);
		}
	}
}