/**
 * Name: Jeffano John
 * Date: Thursday October 28th 2021
 * Student #: 251230759
 * Description: Determining if a certain date is a magic date by multiplying the month and day and checking if it equals to the year
 */

import java.util.Scanner;

public class MagicDatesDemo {
    public static void main(String[] args) {
        //Stores the values from the scanner inputted by the user.
        int month;
        int day;
        int year;

        //Creating the scanner object
        Scanner input = new Scanner(System.in);

        //Reading the month, day and year from scanner
        System.out.println("Enter Month");
        month = input.nextInt();
        System.out.println("Enter Day");
        day = input.nextInt();
        System.out.println("Enter Last 2 Digits of A Year");
        year = input.nextInt();

        //Creating the Cylinder object
        MagicDate md = new MagicDate(month,day,year);

        //Using an if statement and isMagic method to check if the date is a magic date.
        //Prints the appropriate message if the date is a magic date
        if (md.isMagic() == true){
            System.out.println("Date is Magic");
        }
        else {
            System.out.println("Date is not Magic");
        }
    }
}
