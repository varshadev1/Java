// import java.util.Scanner;
// class strings
// {
// 	public static void main (String[] args)
// 	{
// 		Scanner read = new Scanner(System.in);
// 		int n = read.nextInt();
// 		for(int i = 0; i < n; i++)
// 		{
//     		String s = read.next();
//     		String a = "";
//     		for(int j = 0; j < s.length(); j++){
//     		    a = a + s.charAt(j);
//     		}
//     		String b = "";
//     		for(int k = 0; k < s.length(); k++){
//     		    b = a.charAt(k) +b ;
//     		}
//     		System.out.println(a);
//     		System.out.println(b);
// 		}
// 	}
// }


// import java.util.*;
// class strings
// {
// 	public static void main (String[] args)
// 	{
// 		Scanner read = new Scanner(System.in);
// 		int t = read.nextInt();
// 		for(int i=0; i<t; i++)
// 		{
// 		    String a= read.next();
// 		    for(int j=0; j<a.length(); j++){
// 		        // To find ASCII value, store the character in an integer variable.
// 		        int ascii = a.charAt(j);
// 		        System.out.print(ascii + " ");
// 		    }
// 		    System.out.print("\n");
// 		}
// 	}
// }



import java.util.Scanner;
class strings
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String a = read.next();
    		String b = read.next();
    		int j = 0;
    		int n = a.length();
    		// Flag is a very imporant tool in programming problems - you will come across various examples in later problems as well
    		int flag = 0;
    		while(j<n){
    		    //Checking 'a' from left to right and 'b' from right to left
    		    if(a.charAt(j) == b.charAt(n-j-1))
				{
    		        j++;
    		    }
    		    else{
    		        // If specific character in 'a' and 'b' do not match, then they can't be reverse of each other
    		        flag = 1;
    		        break;
    		    }
    		}
    		if(flag == 1){
    		    System.out.println("NO");
    		}
    		else{
    		    System.out.println("YES");
    		}
		}
	}
}