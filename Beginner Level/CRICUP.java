import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CRICUP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int d = sc.nextInt();
		    if(Math.abs(x-y) <= d){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}