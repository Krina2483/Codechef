import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class TYRE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    System.out.println((b*2)+(c*4));
		}
	}
}
