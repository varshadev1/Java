import java.util.Scanner;

public class mypc
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		int a = read.nextInt();

    		if(a>=x && a < y){
    		    System.out.println("YES");
    		}
    		else {
    		    System.out.println("NO");
    		}
		}
	}
}



