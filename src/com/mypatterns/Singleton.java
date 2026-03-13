/**
 *  Java program to demonstrate Singleton pattern.
 */

package com.mypatterns;

/**
 *  Singleton class.
 */
public class Singleton extends Thread {

    // Creating instance of Singleton class.
    private  static Singleton instanse = null;

    // Method to initialize Singleton instance.
    public static Singleton createInstance () throws InterruptedException {
        instanse = new Singleton();

        // Printing that class object created.
        System.out.println("Singleton is started.");

        // Singleton is alive 34567 milliseconds.
        instanse.wait(34567L);

        // Return statement.
        return instanse;

    }


    // Entry point for JVM.
    public static void main(String[] args) throws InterruptedException {

        try {

            // Starting Singleton application.
            Runtime.getRuntime().addShutdownHook(Singleton.createInstance());

        } catch (IllegalMonitorStateException ex) {

            // Printing hash of exception.
            System.out.println(ex.getStackTrace());
            
        }
    }
}
