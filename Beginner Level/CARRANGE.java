import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CARRANGE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int p = sc.nextInt();
		    int m = sc.nextInt();
		    int v = sc.nextInt();
		    
		    if(p==1){
		        System.out.println(m*v);
		    }
		    else{
		        System.out.println((m-p+1)*v);
		    }
		}
	}
}
