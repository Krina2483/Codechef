import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class WCC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		      int x=sc.nextInt();
		      int c=0,n=0;
		      String s=sc.next();
		      for(int i=0;i<s.length();i++){
		           if(s.charAt(i)=='C'){
		                 c++;
		           }else if(s.charAt(i)=='N'){
		                 n++;
		           }else if(s.charAt(i)=='D'){
		                 c++;
		                 n++;
		           }
		     }
		     if(c>n){
		           System.out.println(60*x);

		     }else if(c==n){
		           System.out.println(55*x);

		     }else {
		           System.out.println(40*x);

		     }
		}
	}
}