import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class POLYBAGS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    if(x%10==0){
		        System.out.println(x/10);
		    }
		    else{
		        System.out.println((x/10)+1);
		    }
		}
	}
}
