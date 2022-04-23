import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class WORDLE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--!=0){
		    String s = sc.next();
		    String t = sc.next();
		    String m="";
		    
		    for(int i=0;i<5;i++){
		        if(s.charAt(i)==t.charAt(i)){
		            m=m+"G";
		        }
		        else{
		            m=m+"B";
		        }
		    }
		    System.out.println(m);
		}
	}
}