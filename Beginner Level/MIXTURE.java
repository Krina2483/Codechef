import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class MIXTURE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a==0){
		        System.out.println("Liquid");
		    }
		    else if (b==0){
		        System.out.println("Solid");
		    }
		    else{
		        System.out.println("Solution");
		    }
		}
	}
}