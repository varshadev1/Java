import java.util.*;
import java.util.Scanner;
class mypc
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int N = read.nextInt();
    		int A = read.nextInt();
    		int B = read.nextInt();
            if(N%A == 0 && N%B == 0){
                System.out.println("N is divisible by A and B");
            }
            else if(N%A == 0){
                System.out.println("N is divisible by only A");
            }
            else if(N%B == 0){
                System.out.println("N is divisible by only B");
            }
            
            // The last statement could have been an 'else' statement
            // elif condition used to show usage of 'and' statement
    		else if(N%A != 0 && N%B != 0){
    		    System.out.println("N is divisible by neither A nor B");
    		}
		}
	}
}