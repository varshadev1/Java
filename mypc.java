import java.util.*;
import java.util.Scanner;

public class mypc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s= scan.nextLine()+" ";
        s=scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


// Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).





// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("================================");
//             for(int i=0;i<3;i++){
//                 String s1 = sc.next();
//                 int x = sc.nextInt();
//                 //Complete this line
//                 System.out.printf("%-15s%03d\n",s1, x);
//             }
//             System.out.println("================================");

//     }
// }



