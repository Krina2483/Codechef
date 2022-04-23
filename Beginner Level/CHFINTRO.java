import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHFINTRO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int r = sc.nextInt();
		while(t--!=0){
		    int R = sc.nextInt();
		    if(R>=r){
		        System.out.println("Good boi");
		    }
		    else{
		        System.out.println("Bad boi");
		    }
		}
	}
}