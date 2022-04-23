import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class PENALTY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a[]=new int[10];
		    int first=0,second=0;
		    for(int i=0;i<10;i++){
		        a[i]=sc.nextInt();
		        if(a[i]%2!=0){
		            if(i%2!=0){
		                second++;
		            }
		            else{
		                first++;
		            }
		        }
		    }
		    if(first>second){
		        System.out.println("1");
		    }
		    else if (second>first){
		        System.out.println("2");
		    } 
		    else{
		        System.out.println("0");
		    }
		}
	}
}
