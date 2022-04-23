import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFCHOCO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n,c,x,y;
		
		n = sc.nextInt();
		
		while(n--!=0){
		    c = sc.nextInt();
		    x = sc.nextInt();
		    y = sc.nextInt();
		    
		    System.out.println(y*(c-x));
		}
	}
}
