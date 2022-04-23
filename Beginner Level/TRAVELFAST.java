import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class TRAVELFAST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x<y){
		        System.out.println("BIKE");
		    }
		    else if(y<x){
		        System.out.println("CAR");
		    } 
		    else{
		        System.out.println("SAME");
		    }
		}
	}
}