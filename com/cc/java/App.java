package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /** Typkonvertierung  */
        App.output(String.valueOf(2));  // int --> String
        App.output(Integer.toString(2));  // int --> String
        App.output("Das ist eine Ziffer: " + 2);  // int --> String

        output("------------------------");
        
        // neues Objekt wird erzeugt, Adresse wird cat zugewiesen
        Cat cat = new Cat();
        // Methode output befindet sich in der KLASSE App
        App.output("Blick von aussen: "+ cat); 
        // Methode tellYourAddress() befindet sich im OBJEKT cat 
        cat.tellYourAdress();
    
        output("------------------------");

        // neues Objekt wird erzeugt, Adresse wird cat1 zugewiesen
        Cat cat1 = new Cat();
        // Methode output befindet sich in der KLASSE App
        output("Blick von aussen: "+ cat1); 
        // Methode tellYourAddress() befindet sich im OBJEKT cat1 
        cat1.tellYourAdress();

    }

    // Methode witrd aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}