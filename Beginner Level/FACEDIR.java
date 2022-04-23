import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class FACEDIR
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t--!=0){
	        int x = sc.nextInt();
	        if(x%4==0){
	            System.out.println("North");
	        }
	        else if (x%4==1){
	            System.out.println("East");
	        } 
	        else if (x%4==2){
	            System.out.println("South");
	        }
	        else{
	            System.out.println("West");
	        }
	    }
	}
}
