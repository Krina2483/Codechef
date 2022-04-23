import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class BATTERYLOW
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
		    int t = sc.nextInt();
		    if(t<=15){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}