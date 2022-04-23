import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFSLP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int l = sc.nextInt();
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    if(n <= l/2){
		        System.out.println(n*x);
		    }
		    else{
		        System.out.println((l-n)*x);
		    }
		}
	}
}
