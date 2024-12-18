package testerJar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test_Date {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        // Define the expected date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


        System.out.println("Enter a date (in format dd-MM-yyyy): ");
        String userInput = sc.next();

        try {
            // Parse the user input to a Date object
            Date parsedDate = dateFormat.parse(userInput);//String to Date

            System.out.println("Parsed Date: " + parsedDate);

        } catch (Exception e) {
            // Handle invalid date format
            System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
        }

        sc.close();
    }
}

