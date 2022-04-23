import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class SNAPE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++)
        {
            int b = sc.nextInt();
            int ls = sc.nextInt();
            float rsmin,rsmax;
            rsmin = (float) Math.sqrt((ls*ls)-(b*b));
            rsmax = (float) Math.sqrt((ls*ls)+(b*b));
            System.out.print(rsmin);
            System.out.print(" "+rsmax);
            System.out.println();
        }
	}
}