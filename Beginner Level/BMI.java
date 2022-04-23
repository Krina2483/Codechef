import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class BMI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int m = sc.nextInt();
		    int h = sc.nextInt();
		    
		    if(m/(h*h) <= 18){
		        System.out.println("1");
		    }
		    else if (m/(h*h) <= 24){
		        System.out.println("2");
		    }
		    else if (m/(h*h) <= 29){
		        System.out.println("3");
		    } 
		    else{
		        System.out.println("4");
		    }
		}
	}
}