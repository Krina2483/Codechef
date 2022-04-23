import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SALE2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    if(n%3==0){
		        System.out.println((n/3)*2*x);
		    }
		    else if (n%3==1){
		        System.out.println(n/3*(x*2)+1*x);
		    } 
		    else{
		        System.out.println(n/3*x*2+2*x);
		    }
		}
	}
}
