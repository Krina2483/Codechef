import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class PROBCAT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    if(n<100){
		        System.out.println("Easy");
		    }
		    else if(n<200){
		        System.out.println("Medium ");
		    }
		    else if(n<=300){
		        System.out.println("Hard");
		    }
		}
	}
}