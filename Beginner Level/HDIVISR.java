import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class HDIVISR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0 , m=1;
		int a[]=new int[n];
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        count++;
		        a[count]=i;
		        if(i<10 && i>m){
		            m=i;
		        }
		    }
		}
		System.out.println(m);
	}
}