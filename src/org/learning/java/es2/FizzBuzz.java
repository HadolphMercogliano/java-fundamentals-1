package org.learning.java.es2;
import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.println("Quanti numeri 0(tra 1 e 1000) vuoi stampare?");
      number = scanner.nextInt();
      
    }
    while(number<1 || number>1000 );
    
    for (int i = 1; i <= number; i++) {
      
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.print("FizzBuzz ");
      }else if ( i % 5 == 0) {
        System.out.print("Buzz ");
      }else if (i % 3 == 0) {
        System.out.print("Fizz ");
        
      }else System.out.print(i + " ");
      
    }
  }
}
