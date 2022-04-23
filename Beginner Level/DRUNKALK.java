import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class DRUNKALK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int x = sc.nextInt();
		    int step = 0;
		    for(int i=1;i<=x;i++){
		        if(i%2==1){
		            step+=3;
		        }
		        else{
		            step=step-1;
		        }
		    }
		    System.out.println(step);
		}
	}
}