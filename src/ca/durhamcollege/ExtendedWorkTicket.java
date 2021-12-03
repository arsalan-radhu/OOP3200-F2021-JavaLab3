/*
 * Name: Arsalan Arif Radhu
 * Student ID: 100813965
 * Date: 1 December 2021
 * Description: ExtendedWorkTicket class is created from the WorkTicket
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket
{
    //Private Instance Variables
    public boolean myOpen;

    //Constructors
    //Parameterized Constructor
    public ExtendedWorkTicket(int ticketNumber, String id, LocalDate date, String description, boolean myOpen)
    {
        this.ticketNumber = ticketNumber;
        this.id = id;
        this.date = date;
        this.description = description;
        this.myOpen = myOpen;
    }

    //Default Constructor
    public  ExtendedWorkTicket()
    {
        super();
        openTicket();
    }

    //Parameterized Constructor which accepts WorkTicket as a parameter
    public ExtendedWorkTicket(WorkTicket ticket, boolean myOpen)
    {
        this.ticketNumber = ticket.ticketNumber;
        this.id = ticket.id;
        this.date = ticket.date;
        this.description = ticket.description;
        this.myOpen = myOpen;
    }

    //Private Methods

    //Public Methods (Getters and Setters)
    //myOpen getter
    public boolean getOpen()
    {
        return myOpen;
    }

    //myOpen setter
    public void setOpen(boolean open)
    {
        myOpen = open;
    }

    //Method for opening a ticket
    public void openTicket()
    {
        this.myOpen = true;
    }

    //Method for closing a ticket
    public void closeTicket()
    {
        this.myOpen = false;
    }

    //Method returning the status of the ticket
    public String isOpen()
    {
        String status = "";

        if (myOpen == true)
        {
            status = "This ticket is open!";
        }
        else
        {
            status = "This ticket is closed!";
        }

        return status;
    }

    //SetWorkTicket Override
    public void SetWorkTicket()
    {
        setTicketNumber();
        setId();
        setDate();
        setDescription();
        openTicket();
    }

    // toString Override
    public String toString()
    {
        String output = "";
        output += "\n========================================\n";
        output += "Ticket Number: " + (getTicketNumber()) + "\n";
        output += "Ticket Date: " + getDate() + "\n";
        output += "Ticket ID: " + getId() + "\n";
        output += "Ticket Description: " + getDescription() + "\n";
        output += "Ticket Status: " + isOpen() + "\n";
        output += "========================================\n";

        return output;
    }

}