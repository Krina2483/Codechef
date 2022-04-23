import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class BLACKJACK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(21-x-y<=10 && 21-x-y>=1){
		        System.out.println(21-x-y);
		    }
		    else{
		        System.out.println("-1");
		    }
		}
	}
}
