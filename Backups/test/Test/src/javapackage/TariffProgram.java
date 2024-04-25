package javapackage;

import java.util.Scanner;

public class TariffProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the month:");
		int month = scanner.nextInt();

		System.out.println("Enter the room rent per day:");
		double roomrent = scanner.nextDouble();

		System.out.println("Enter the number of days stayed:");
		int numberofdays = scanner.nextInt();

		double totalTariff = calculateTariff(month, roomrent, numberofdays);
		System.out.printf("Hotel tariff: ", totalTariff);
	}

	public static double calculateTariff(int month, double roomrent, int numberofdays) {
		double tariff;

		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			roomrent = roomrent * 1.20; // Increase room rent by 20% during peak seasons
			break;
		default:
			break;
		}

		tariff = roomrent * numberofdays;
		return tariff;
	}
}