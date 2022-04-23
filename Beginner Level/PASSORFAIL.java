import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class PASSORFAIL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int p=sc.nextInt();
		    int mark=(x*3)-(n-x);
		    
		    if(mark>=p){
		        System.out.println("PASS");
		    }
		    else{
		        System.out.println("FAIL");
		    } 
		}
	}
}