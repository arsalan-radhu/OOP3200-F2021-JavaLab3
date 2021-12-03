/*
 * Name : Arsalan Arif Radhu
 * Student ID: 100813965
 * Date: 1 December2021
 * Description: Main File
 */

package ca.durhamcollege;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Declarations
        //Variables
        Scanner keyboard = new Scanner(System.in);
        boolean test = true;
        boolean isValid = true;
        LocalDate currentDate = LocalDate.now();
        int ticketNumber = 123;
        String alphaCode = "AAA000";
        String desc = "Parameterized Ticket";
        WorkTicket exampleTicket0 = new WorkTicket(101, "ABC123", currentDate, "WorkTicket Construction");
        ExtendedWorkTicket exampleTicket = new ExtendedWorkTicket();
        ExtendedWorkTicket exampleTicket1 = new ExtendedWorkTicket(ticketNumber, alphaCode, currentDate, desc, test);
        ExtendedWorkTicket exampleTicket2 = new ExtendedWorkTicket(exampleTicket0, test);

        do
        {
            try
            {
                //Printing example tickets
                System.out.println("WorkTicket Parameterized Constructor");
                System.out.println(exampleTicket2.toString());
                System.out.println("Parameterized Constructor");
                System.out.println(exampleTicket1.toString());
                System.out.println("Default Constructor");
                System.out.println(exampleTicket.toString());

                //Setting the new ticket
                exampleTicket.SetWorkTicket();
                System.out.println(exampleTicket.toString());

                exampleTicket.closeTicket();
                System.out.println(exampleTicket.toString());

                isValid = false;
            }
            catch(IllegalArgumentException iae)
            {
                System.out.printf("\n Incorrect input: %s", iae.toString());
                keyboard.nextLine();
                isValid = true;
            }
            catch(InputMismatchException ime)
            {
                System.out.print("\nIncorrect input, please try again!");
                keyboard.nextLine();
                isValid = true;
            }

        }
        while (isValid);
    }

}
