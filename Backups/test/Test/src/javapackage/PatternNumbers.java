package javapackage;

public class PatternNumbers {

	public static void main(String[] args) {
		int n = 4; // Sample input
        int num = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}