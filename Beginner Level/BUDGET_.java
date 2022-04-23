import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class BUDGET_
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(30*y <= x){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
