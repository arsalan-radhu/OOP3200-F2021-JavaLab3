/*
 * Name: Arsalan Arif Radhu
 * Date: 1 December 2021
 * Description: ExtendedWorkTicket class is created
 */

package ca.durhamcollege;

import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket
{
    //Private Instance Variables
    public boolean myOpen;

    //Public Properties

    //Constructors
    //Parameterized constructor using parameters from base class
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
    //Parameterized Constructor using a Work ticket object
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

    //Method to open a ticket
    public void openTicket()
    {
        this.myOpen = true;
    }

    //Method to close a ticket
    public void closeTicket()
    {
        this.myOpen = false;
    }

    //Method to return the status of the ticket
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