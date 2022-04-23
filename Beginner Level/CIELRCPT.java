import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CIELRCPT
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int p=sc.nextInt();
		    int count=0;
		    for(int j=11;j>=0;j--)
		    {
		        while(p>=Math.pow(2,j))
		        {
		            count++;
		            p-=Math.pow(2,j);
		        }
		    }
		    System.out.println(count);
		}
	}
}
