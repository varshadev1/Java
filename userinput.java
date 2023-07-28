// package com.company;
import java.util.Scanner;
public class userinput{
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a;
    //     System.out.println("enter any number");
    //     a= sc.nextInt();
    //     System.out.println("You have entered: " + a);           
    // }
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);        
  }

}