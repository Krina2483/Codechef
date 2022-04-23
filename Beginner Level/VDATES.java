import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class VDATES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int d = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    
		    if(d>=l && d<=r){
		        System.out.println("Take second dose now");
		    }
		    else if(d<l){
		        System.out.println("Too Early");
		    }
		    else{
		        System.out.println("Too Late");
		    }
		}
	}
}