import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class FINDSHOES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if(n<m){
		        System.out.println(n);
		    }
		    else{
		        System.out.println(n+Math.abs(m-n));
		    }
		}
	}
}