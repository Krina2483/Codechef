import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CABS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t--!=0){
		    int b=0;
		    int r=0;
		    int e=0;
		    int m=0;
		    for(int j=0;j<4;j++){
		        String s=sc.next();
		        if(s.equalsIgnoreCase("Barcelona"))
		        b=sc.nextInt();
		        else if(s.equalsIgnoreCase("RealMadrid"))
		        r=sc.nextInt();
		        
		         else if(s.equalsIgnoreCase("Malaga"))
		        m=sc.nextInt();
		        
		         else if(s.equalsIgnoreCase("Eibar"))
		        e=sc.nextInt();
		    }
		    if(b>e && r<m)
		    System.out.println("Barcelona");
		    else
		    System.out.println("RealMadrid");
		}
		        
		        
	}
}
