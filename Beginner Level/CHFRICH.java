import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFRICH
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    if((b-a)%x==0){
		        System.out.println((b-a)/x);
		    }
		    else{
		        System.out.println(((b-a)/x)+1);
		    }
		}
	}
}