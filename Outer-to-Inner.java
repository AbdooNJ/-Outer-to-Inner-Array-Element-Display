/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Outer-to-Inner;

/**
 * This class implements a method to display elements of an integer array
 * starting from the outermost elements towards the center,
 * considering different cases for arrays of even and odd lengths.
 *
 * @author Abdulhakeem Al-Najadi
 */
public class  Outer-to-Inner {

    /**
     * The main method creates an integer array and calls the displayOutIn method to display its elements.
     *
     * @param args the command line arguments (unused)
     */
    public static void main(String[] args) {
        int[] A = {15, 74, 106, 10, 9, 86, 34}; // Example array
        displayOutIn(A, 0, A.length - 1); // Display elements
    }

    /**
     * Recursively displays elements of the given array from outer to inner.
     *
     * @param arr the integer array to display
     * @param start the starting index of the current range to display
     * @param end the ending index of the current range to display
     */
    public static void displayOutIn(int[] arr, int start, int end) {
        // Check if the array length is even
        if (arr.length % 2 == 0) {
            // Base case: when 1 element is left
            if (end - start == 1) {
                System.out.println(arr[start] + "," + arr[end]); // Print the two elements
            } else {
                // General case: print outermost elements and recursively call for inner elements
                System.out.println(arr[start] + "," + arr[end]);
                displayOutIn(arr, start + 1, end - 1);
            }
        } else { // Check if the array length is odd
            // Base case: when 2 elements are left
            if (start == end) {
                System.out.println(arr[start]); // Print the single remaining element
            } else {
                // General case: print outermost elements and recursively call for inner elements
                System.out.println(arr[start] + "," + arr[end]);
                displayOutIn(arr, start + 1, end - 1);
            }
        }
    }
}

    
    

