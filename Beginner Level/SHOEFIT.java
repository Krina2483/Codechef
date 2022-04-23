import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SHOEFIT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int r=0;
		    int l=0;
		    if(a==0){
		        r++;
		    }
		    else{
		        l++;
		    }
		    if(b==0){
		        r++;
		    }
		    else{
		        l++;
		    }
		    if(c==0){
		        r++;
		    }
		    else{
		        l++;
		    }
		    if(r>=1&&l>=1){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}
		    
	}
}
