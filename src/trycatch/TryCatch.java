/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.Scanner;


public class TryCatch {

    
    public static void main(String[] args) {
        // TODO code application logic here
      
      Scanner sc=new Scanner(System.in);
      
      int x=1;
      
      do{
      try{
        System.out.println("Give first number :");
       int num1=sc.nextInt();
        System.out.println("Give secont number :");
        int num2=sc.nextInt();
        int sum=num1/num2;
        System.out.println(sum);
        x=2;
      } 
      catch(ArithmeticException a){
          System.out.println("Rong number!!!");
      } 
      } while (x==1);
      
    }
}
     


    

