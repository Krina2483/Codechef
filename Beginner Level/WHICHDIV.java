import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class WHICHDIV
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    if(x<1600){
		        System.out.println("3");
		    }
		    else if (x<2000){
		        System.out.println("2");
		    } 
		    else{
		        System.out.println("1");
		    }
		}
	}
}
