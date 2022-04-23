import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFRACES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if((a==x || a==y)&&(b==x || b==y)){
		        System.out.println("0");
		    }else if ((a==x || a==y)||(b==x || b==y)){
		        System.out.println("1");
		    } 
		    else{
		        System.out.println("2");
		    }
		}
	}
}