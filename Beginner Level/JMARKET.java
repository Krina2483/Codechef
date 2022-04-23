import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class JMARKET
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		    int x=sc.nextInt();
		    int a[]=new int[3];
		    for(int i=0; i<3; i++){
		        a[i] =sc.nextInt();
		    } 
		    Arrays.sort(a);
		    System.out.println((x-1)*a[0]+a[1]);
		}
	}
}
