package org.learning.java.es1;
import java.util.Scanner;
import java.text.DecimalFormat;


public class BigliettoTreno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    DecimalFormat format = new DecimalFormat("#.00");
    
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
    else finalTicketPrice = ticketNoDisc;
    
    String finalTicketPriceFormatted = format.format(finalTicketPrice);
    
    System.out.println("Il prezzo del tuo biglietto è: " + finalTicketPriceFormatted);
  }
    }
    
    
 
