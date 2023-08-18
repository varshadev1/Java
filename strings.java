import java.util.Scanner;
class strings
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for(int i = 0; i < n; i++)
		{
    		String s = read.next();
    		String a = "";
    		for(int j = 0; j < s.length(); j++){
    		    a = a + s.charAt(j);
    		}
    		String b = "";
    		for(int k = 0; k < s.length(); k++){
    		    b = a.charAt(k) +b ;
    		}
    		System.out.println(a);
    		System.out.println(b);
		}
	}
}