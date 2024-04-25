package javapackage;

import java.util.Scanner;

public class GradeProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks scored by the student:");
		int marks = scanner.nextInt();

		String grade = calculateGrade(marks);
		System.out.println("Grade: " + grade);
	}

	public static String calculateGrade(int marks) {
		if (marks > 100) {
			System.out.println("Invalid Input");
		}

		int gradeValue = marks / 10;
		String grade;

		switch (gradeValue) {
		case 10:
			grade = "S";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
		}
		return grade;

	}
}
