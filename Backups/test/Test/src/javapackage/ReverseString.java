package javapackage;

import java.util.Scanner;

public class ReverseString {
    
    public static String reverse(String inputString) {
        // Create an empty string to store the reversed result
        String reversed = "";
        
        // Iterate over the characters of the input string in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed = reversed + inputString.charAt(i); // Append each character to the reversed string
        }
        
        return reversed; // Return the reversed string
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Call the reverseString method to reverse the input string
        String reversedString = reverse(inputString);
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

	}

}
