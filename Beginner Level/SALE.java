import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SALE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int s,a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		    if(a<b){
		        if(a<c){
		            s=a;
		        }
		        else{
		            s=c;
		        }
		    }
		    else{
		        if(b<c){
		            s=b;
		        }
		        else{
		            s=c;
		        }
		    }
		    System.out.println((a+b+c)-s);
		}
	}
}