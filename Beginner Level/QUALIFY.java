import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class QUALIFY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n--!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if((y*1)+(z*2)>=x){
		        System.out.println("Qualify");
		    }
		    else{
		        System.out.println("NotQualify");
		    }
		} 
	}
}