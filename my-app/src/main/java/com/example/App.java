package com.example;

/**
 * Utility class with the main method.
 */
public final class App { // Declare the class as final

    // Private constructor to prevent instantiation
    private App() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * The main method.
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Hello, World!");
    }
}
