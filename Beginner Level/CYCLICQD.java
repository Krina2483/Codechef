import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CYCLICQD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		    int sum1=a+c;
		    int sum2=b+d;
		    if(sum1==180 && sum2==180){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}