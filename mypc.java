import java.util.*;
import java.util.Scanner;
class mypc{
    public static void main(String[] args){
        System.out.println("plz enter a number ");
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        for(int i=1;i<=10;i++)
        {
        System.out.print(" "+inp*i);
        }
    }
}