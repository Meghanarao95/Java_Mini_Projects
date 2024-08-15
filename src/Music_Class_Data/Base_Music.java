package Music_Class_Data;

import java.util.Scanner;

public class Base_Music {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input name
		System.out.println("Enter student's name :");
		String name = scanner.next();

		// name validation
		if (!name.matches("[a-zA-Z]+")) {
			System.out.println(" Invalid input ! Name should only consist letters");
			return; // Exit if name is invalid
		}

		// input and validation of age
		System.out.println("Enter student's  age :");
		if (!scanner.hasNextInt()) {
			System.out.println("Invalid input! Age should be an integer.");
			return; // Exit if age is invalid
		}
		// Read the integer after validation
		int age = scanner.nextInt();

		// Input and validation for Phone Number (10 digits)
		System.out.println("Enter the Phone Number :");

		String phno = scanner.next();

		if (!phno.matches("\\d{10}")) {
			System.out.println("Invalid input! The total number of digits for a phone number is 10 and it should be an integer.");
			return; // Exit if phone number is invalid
		}

		System.out.println("Information of student : ");

		System.out.println("Name:" + name + " Age:" + age + " PhoneNo:" + phno);

		scanner.close();
	}

}
