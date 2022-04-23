import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class T20MCH
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
	    int o = sc.nextInt();
	    int c = sc.nextInt();
	    int mx=(20-o)*36;
	    if(c+mx > r){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	    }
	}
}
