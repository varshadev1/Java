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



// import java.util.Scanner;
// class strings
// {
// 	public static void main (String[] args)
// 	{
// 		Scanner read = new Scanner(System.in);
// 		int t = read.nextInt();
// 		for(int i=0; i<t; i++)
// 		{
//     		String a = read.next();
//     		String b = read.next();
//     		int j = 0;
//     		int n = a.length();
//     		// Flag is a very imporant tool in programming problems - you will come across various examples in later problems as well
//     		int flag = 0;
//     		while(j<n){
//     		    //Checking 'a' from left to right and 'b' from right to left
//     		    if(a.charAt(j) == b.charAt(n-j-1))
// 				{
//     		        j++;
//     		    }
//     		    else{
//     		        // If specific character in 'a' and 'b' do not match, then they can't be reverse of each other
//     		        flag = 1;
//     		        break;
//     		    }
//     		}
//     		if(flag == 1){
//     		    System.out.println("NO");
//     		}
//     		else{
//     		    System.out.println("YES");
//     		}
// 		}
// 	}
// }


// import java.util.Scanner;
// class strings
// {
// 	public static void main (String[] args)
// 	{
// 		Scanner read = new Scanner(System.in);
// 		int n = read.nextInt();
// 		for(int i=0; i<n; i++)
// 		{
//     		String s = read.next(); //hidden word
//     		String t = read.next(); //guess word
//     		String m = "";          //determine the correctness of guess word for ith position
//     		int j = 0;
//     		while(j < s.length()){
//     		    if(s.charAt(j) == t.charAt(j)){
// 					//if the guess on ith position is correct then the character for m is G.
//     		        m = m + "G";
//     		    }
//     		    else {
// 					//if the guess on ith position is incorrect then the character for m is B.
//     		        m = m + "B";
//     		    }
//     		    j++;
//     		}
//     		System.out.println(m);	
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
    		String s = read.next();
    		int j = 0;
    		int flag = 0;
    		 while(j < (s.length() - 2)){
                // if any element is a vowel, and its next 2 elements are vowels, then our condition is met 
                if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
                {
                if(s.charAt(j+1)=='a' || s.charAt(j+1)=='e' || s.charAt(j+1)=='i' || s.charAt(j+1)=='o' || s.charAt(j+1)=='u')
                {
                if(s.charAt(j+2)=='a' || s.charAt(j+2)=='e' || s.charAt(j+2)=='i' || s.charAt(j+2)=='o' || s.charAt(j+2)=='u')
                {
                            flag = 1;
                            break;
                        }
                    }
                }
                j++;
            }
            if(flag == 1){
                System.out.println("Happy");
            }
            else{
                System.out.println("Sad");
		}
	}
}
}