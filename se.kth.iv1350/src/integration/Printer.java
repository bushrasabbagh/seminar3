package integration;

import model.Reciept;

/**
 * Represents a printer.
 */
public class Printer {

    /**
     * Creates an instance, represented as a printer.
     */
    public Printer(){ }

    /**
     * Prints the specified receipt, this is a dummy printer and not a real one.
     * It prints to <code>System.out</code>, instead of a printer.
     *
     * @param reciept The specified receipt that will be printed.
     */
    public void printReceipt(Reciept reciept){
        System.out.println(reciept.toString());
    }
}