import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEAPFUEL
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t--!=0){
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int k = sc.nextInt();
	        if(x+(a*k) < y+(b*k)){
	            System.out.println("PETROL");
	        }
	        else if (x+(a*k) > y+(b*k)) {
	            System.out.println("DIESEL");
	        }
	        else{
	            System.out.println("SAME PRICE");
	        }
	    }
	}
}
