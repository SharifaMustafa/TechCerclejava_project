package day11_ForLoop;

import java.util.Scanner;

public class HomeWork4calculatethesalary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Are you married? (true/false): ");
        boolean isMarried = scanner.nextBoolean();

        double taxRate;

        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate -= 0.05; // 5% less tax if married
        }

        double taxAmount = salary * taxRate;
        double salaryAfterTax = salary - taxAmount;

        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Tax amount: $" + taxAmount);
        System.out.println("Salary after tax: $" + salaryAfterTax);

        scanner.close();
    }
		
	}

