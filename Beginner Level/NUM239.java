import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class NUM239
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int count =0;
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    for(int i=x;i<=y;i++){
		        if(i%10==2 || i%10==3 || i%10==9){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}