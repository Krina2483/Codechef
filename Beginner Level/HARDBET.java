import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class HARDBET
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		    if(a<b){
		        if(a<c){
		            System.out.println("DRAW");
		        }
		        else{
		            System.out.println("Alice");
		        }
		    }
		    else{
		        if(b<c){
		            System.out.println("Bob");
		        }
		        else{
		            System.out.println("Alice");
		        }
		    }
		}
	}
}
