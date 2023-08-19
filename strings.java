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


import java.util.*;
class strings
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    String a= read.next();
		    for(int j=0; j<a.length(); j++){
		        // To find ASCII value, store the character in an integer variable.
		        int ascii = a.charAt(j);
		        System.out.print(ascii + " ");
		    }
		    System.out.print("\n");
		}
	}
}