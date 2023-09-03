import java.util.*;
class maths
{//all the entered digits of integers,each seperated by space
     public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            ArrayList<Integer> final_ans = new ArrayList<>();
            while (n>0) {
                final_ans.add(0, n % 10);
                n = n / 10;
            }
            for (int j=0; j<final_ans.size(); j++) {
                System.out.print(final_ans.get(j) + " ");
            }
            System.out.println();
        }
    }
}




import java.util.Scanner;
class maths
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String n = read.next();
    		// Loop through and print each character of the String
    		for(int j=0; j<n.length(); j++){
    		    System.out.print(n.charAt(j) + " ");
    		}
    		System.out.println();
		}
	}
}