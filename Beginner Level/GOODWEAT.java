import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class GOODWEAT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int sunny=0, rainy=0, a[] = new int[7];
		    for(int i=0;i<7;i++){
		        a[i]=sc.nextInt();
		        if(a[i]==1){
		            sunny++;
		        }
		        else{
		            rainy++;
		        } 
		    }
		    if(sunny>rainy){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}