import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CARCHOICE
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            double x1= sc.nextInt();
            double x2= sc.nextInt();
            double y1= sc.nextInt();
            double y2= sc.nextInt();
            
            if(y1/x1 > y2/x2){
                System.out.println("1");
            }
            else if(y1/x1 < y2/x2){
                System.out.println("-1");
            }
            else{
                System.out.println("0");
            }
        }
	}
}