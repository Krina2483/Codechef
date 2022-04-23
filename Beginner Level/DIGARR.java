import java.util.*;

public class DIGARR
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t--!=0){
		    int count=0;
		    int d=sc.nextInt();
		    sc.nextLine();
		    String s=sc.next();
		    
		    for(int i=0; i<d; i++){
		        //int str=(int) s.charAt(i);
		        if(s.charAt(i)=='5' || s.charAt(i)=='0'){
		            count++;
		        }
		    }
		    
		    if(count!=0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}