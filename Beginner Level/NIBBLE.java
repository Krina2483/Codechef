import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class NIBBLE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int x = sc.nextInt();
		    if(x%4==0){
		        System.out.println("Good");
		    }
		    else{
		        System.out.println("Not Good");
		    }
		} 
	}
}