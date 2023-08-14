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

//if (x) is greater than 100 then it prints (x-100) otherwise print x.
import java.util.Scanner;
class mypc {    
	    public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		if(x>100){
    		    System.out.println(x-10);
    		}
    		else{
    		    System.out.println(x);
    		}
    		
		}
	}
}



// odd and even finding within two user entered numbers 
import java.util.Scanner;
class mypc
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int a = read.nextInt();
    		int b = read.nextInt();
    		
            if( a != b && (a%2 != 0 && b%2 != 0)){
                System.out.println("a and b are different and are odd");
            }
            else if(a != b && (a%2 == 0 && b%2 == 0)){
                System.out.println("a and b are different and are even");
            }
            else{
                System.out.println("Doesn't matter");
            }
		}
	}
}