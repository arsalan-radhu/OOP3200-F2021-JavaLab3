/*
 * Name : Arsalan Arif Radhu
 * Student ID: 100813965
 * Date: 21 November 2021
 * Description: Work ticket class file. Taken from last lab.
 */

package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class WorkTicket
{
    //ATTRIBUTES
    public int ticketNumber;
    public String id;
    public LocalDate date;
    public String description;

    //PROPERTIES
    public int getTicketNumber()
    {
        return ticketNumber;
    }

    public void setTicketNumber()
    {
        //DECLARATIONS
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        int ticketNumber = 0;

        while(isValid)
        {
            System.out.print("\nEnter a ticket number: ");
            // Taking user input
            ticketNumber = keyboard.nextInt();
            if(ticketNumber <= 0)
            {
                throw new IllegalArgumentException("Please enter positive numbers only.");
            }
            else
            {
                this.ticketNumber = ticketNumber;
                isValid = false;
            }
        }

    }

    public String getId()
    {
        return id;
    }

    public void setId()
    {
        //DECLARATIONS
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        String id = null;
        while(isValid)
        {
            System.out.print("\nEnter a custom ID: ");
            // Taking user input
            id = keyboard.nextLine();
            if (id.length() <= 0)
            {
                throw new IllegalArgumentException("Input should not be empty.");
            }
            else
            {
                this.id = id;
                isValid = false;
            }
        }


    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate() {
        //CONSTANTS
        final int MAX_YEAR = 2099;
        final int MIN_YEAR = 2000;
        final int MAX_MONTH = 12;
        final int MIN_MONTH = 1;
        final int MAX_DAY = 30;
        final int MIN_DAY = 1;
        //VARIABLES
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        int day = 0, month = 0, year = 0;

        try {

            while (isValid) {
                System.out.print("\nPlease enter the day: ");
                // Taking user input for the date
                day = keyboard.nextInt();
                if (day >= MIN_DAY && day <= MAX_DAY) {
                    isValid = false;
                } else {
                    System.out.print("\nDay must be between 1 and 30. Try Again!\n");
                }
            }
            isValid = true;
            System.out.printf("Day is: %d\n", day);

            while(isValid)
            {
                System.out.print("\nPlease enter the month: ");
                // Taking user input for the month
                month = keyboard.nextInt();
                if (month >= MIN_MONTH && month <= MAX_MONTH)
                {
                    isValid = false;
                }
                else
                {
                    System.out.print("\nMonth must be between 1 and 12. Try Again!\n");
                }
            }
            isValid = true;
            System.out.printf("Month is: %d\n", month);

            while(isValid)
            {
                System.out.print("\nPlease enter the Year: ");
                // Taking user input for the year
                year = keyboard.nextInt();
                if (year >= MIN_YEAR && year <= MAX_YEAR)
                {
                    isValid = false;
                }
                else
                {
                    System.out.print("\nYear must be between 2000 and 2099. Try Again.\n");
                }
            }
            isValid = true;
            System.out.printf("Year is: %d\n", year);

            LocalDate date;
            date = LocalDate.of(year, month, day);

            this.date = date;

        }
        catch (DateTimeException dte) {
            System.out.print("\nUnexpected error.");
            keyboard.nextLine();
        }
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription()
    {

        //DECLARATIONS
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;
        String description = null;
        while(isValid)
        {
            System.out.print("\nEnter the reason for making a ticket: ");
            // Taking user input for the description of the issue
            description = keyboard.nextLine();
            if(description.length() <= 0)
            {
                throw new IllegalArgumentException("Description should not be empty.");
            }
            else
            {
                this.description = description;
                isValid = false;
            }
        }

    }

    public void SetWorkTicket()
    {
        setTicketNumber();
        setId();
        setDate();
        setDescription();
    }

    @Override
    public String toString()
    {
        String ticketString = "";
        ticketString += "\n========================================\n";
        ticketString += "Ticket Number: " + (getTicketNumber()) + "\n";
        ticketString += "Ticket Date: " + getDate() + "\n";
        ticketString += "Ticket ID: " + getId() + "\n";
        ticketString += "Ticket Description: " + getDescription() + "\n";
        ticketString += "\n========================================\n";

        return ticketString;
    }
    //CONSTRUCTORS
    WorkTicket()
    {
        this.ticketNumber = 0;
        this.id = null;
        this.date = null;
        this.description = null;
    }

    //Object Constructor
    WorkTicket(@NotNull WorkTicket ticket)
    {
        this.ticketNumber = ticket.ticketNumber;
        this.id = ticket.id;
        this.date = ticket.date;
        this.description = ticket.description;
    }
    //Parameterized  Constructor
    WorkTicket(int ticketNumber, String id, LocalDate date, String desc)
    {
        this.ticketNumber = ticketNumber;
        this.id = id;
        this.date = date;
        this.description = desc;
    }

}