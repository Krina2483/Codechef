import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHSFORMT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a+b < 3){
		        System.out.println("1");
		    }
		    else if (a+b <= 10){
		        System.out.println("2");
		    } 
		    else if (a+b <= 60){
		        System.out.println("3");
		    }
		    else{
		        System.out.println("4");
		    }
		}
	}
}
