import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class HELIUM3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    if(a*b<=c*d){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    } 
		}
	}
}