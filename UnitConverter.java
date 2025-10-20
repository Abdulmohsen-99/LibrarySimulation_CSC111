package lab01;

import java.util.Locale; //To print numbers in English
import java.util.Scanner;//To take input from user

public class UnitConverter {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		System.out.println("Enter the units (m_ft, L_gal, SAR_USD): "); //السلام عليكم
		String Unit = input.next();
		Unit = Unit.toLowerCase(); // To entry any value entered by the user

		if (Unit.equals("m_ft")) { //To convert from m to ft

			System.out.println("Enter two numbers: ");
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num2InMeters = num2 * 0.3048;

			if (num1 > num2InMeters) {
				System.out.printf(Locale.US, "%.1f m is greater than %.4f m", num1, num2InMeters);
			} else if (num1 < num2InMeters) {
				double num1Infeet=num1*3.28084;
				System.out.println(num2 + " ft is greater than " + num1Infeet + "ft");
			} else {
				System.out.println(num1 + " m is equal " + num2 + " ft");
			}
		} else if (Unit.equals("l_gal")) { //To convert from L to gal
			System.out.println("Enter two numbers: ");
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num2InLiter = num2 * 3.78541;

			if (num1 > num2InLiter) {
				System.out.println(num1 + " L is greater than " + num2InLiter + " L");
			} else if (num1 < num2InLiter) {
				double num1InGal = num1 * 0.264172;
				System.out.printf(Locale.US, "%.1f gal is greater than %.6f gal", num2, num1InGal);
			} else {
				System.out.println(num1 + " L is equal " + num2 + " gal");
			}
		} else if (Unit.equals("sar_usd")) { ///To convert from sar to usd

			System.out.println("Enter two numbers: ");
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num2InSar = num2 * 3.75;

			if (num1 > num2InSar) {
				System.out.println(num1 + " sar is greater than " + num2InSar + " sar");
			}

			else if (num1 < num2InSar) {
				double num1InUsd = num1 * 0.2667;
				System.out.printf(Locale.US, "%.1f USD is greater than %.2f USD", num2, num1InUsd);
			} else {
				System.out.println(num1 + " SAR is equal " + num2 + " USD");
			}
		} else { //Error massage
			System.out.println("Invaid operation");
		}
	}
}

