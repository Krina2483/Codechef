import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class TWOVSTEN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int count=0;
		    int x=sc.nextInt();
		    if(x%10==0){
		        System.out.println("0");
		    }
		    else if(x%10!=0 && x%10==5 ){
		        x=x*2;
		        count++;
		        
		    
		    System.out.println(count);
		    }
		    else{
		        System.out.println("-1");
		    }
		}
	}
}
