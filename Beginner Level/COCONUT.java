import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class COCONUT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int xa = sc.nextInt();
		    int xb = sc.nextInt();
		    int ya = sc.nextInt();
		    int yb = sc.nextInt();
		    int a=0,b=0;
		    
		    if(ya%xa==0){
		        a=ya/xa;
		    }
		    else{
		        a=(ya/xa)+1;
		    }
		    if(yb%xb==0){
		        b=yb/xb;
		    }
		    else{
		        b=(yb/xb)+1;
		    }
		    System.out.println(a+b);
		}
	}
}
