import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFBOTTLE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t,n,x,k;
		
		t = sc.nextInt();
		
		while(t!=0){
		    int bottle;
		    n = sc.nextInt();
		    x = sc.nextInt();
		    k = sc.nextInt();
		    
		    bottle=k/x;
		    if(n>bottle){
		        System.out.println(bottle);
		    }
		    else{
		        System.out.println(n);
		    } 
		    t--;
		}
	}
}