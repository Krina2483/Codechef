import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class THREEQ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0){
	        int a1=sc.nextInt();
	        int a2=sc.nextInt();
	        int a3=sc.nextInt();
	        int sum=a1+a2+a3;
	        int b1=sc.nextInt();
	        int b2=sc.nextInt();
	        int b3=sc.nextInt();
	        int sum2=b1+b2+b3;
	        if(sum==sum2)
	        System.out.println("Pass");
	        else
	         System.out.println("Fail");
	         t--;
	    }
	}
}
