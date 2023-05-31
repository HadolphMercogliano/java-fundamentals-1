package org.learning.java.es1;
import java.util.Scanner;

public class BigliettoTreno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double pricePerKm = 0.21;
    int percUnder18 = 20;
    int percOver65 = 40;
    double finalTicketPrice;
    
    // chiedi quanti km si vuole percorrere e inserisci il valore nella variabile "km"
    System.out.println("Quanti km vuoi percorrere? ");
    int km = scanner.nextInt();
    
    // chiedi quanti anni ha il passeggero e inserisci il dato nella variabile "age"
    System.out.println("Quanti anni hai? ");
    int age = scanner.nextInt();
    
    double ticketNoDisc = (km * pricePerKm);
    
    if (age < 18) {
      finalTicketPrice = ticketNoDisc - (ticketNoDisc/100)*percUnder18;
    }
    else if (age>65) {
      finalTicketPrice = ticketNoDisc - (ticketNoDisc/100)*percOver65;
    
    }
    else{
      finalTicketPrice = ticketNoDisc;
      
    }
    System.out.println("Il prezzo del tuo biglietto è: " + finalTicketPrice);
  }
    }
    
    
 
