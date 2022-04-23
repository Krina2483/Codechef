import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CCISLAND
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    double x = sc.nextInt();
		    double y = sc.nextInt();
		    double xr = sc.nextInt();
		    double yr = sc.nextInt();
		    int d = sc.nextInt();
		    
		    if(Math.min(x/xr , y/yr) >= d){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
