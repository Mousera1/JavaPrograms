package javapackage;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        
       
        if (isPalindrome(inputString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
}
	public static boolean isPalindrome(String inputString) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
		String cleanedString = inputString.toLowerCase();
        
        // Length of the string
        int n = cleanedString.length();
        
        // Check if the string is a palindrome using a for loop
        for (int i = 0; i < n / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(n - 1 - i)) {
                return false;
            }
        }
		return true;
        
    }}