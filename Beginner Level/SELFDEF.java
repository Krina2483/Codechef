import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SELFDEF
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int i=0;
		    int a[]=new int[n];
		    while(n--!=0){
		        int c = sc.nextInt();
		        if(c>=10 && c<=60){
		            a[i]=c;
		            i++;
		        }
		    }
		    System.out.println(i);
		}
	}
}