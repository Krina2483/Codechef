import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CENTREE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    while(t-- > 0)
		    {
		        int n=scan.nextInt();
			    int b=scan.nextInt();
			    if(n==2 ){
			     	if(b==1){
					System.out.println("YES");
					System.out.println("1 2");
					}
					else{
					System.out.println("NO");
				}
				continue;
		    	}
		    	if(4*b>n){
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
			for(int i=0;i<2*b;i++){
				System.out.println((i+1)+" "+(i+2));
				
			}

			for(int i=2*b+1;i<n;i++){
				System.out.println(1+" "+(i+1));
			}
			
		    }
		    scan.close();
		}
		catch(Exception e)
		{
		    
		}
	}
}
