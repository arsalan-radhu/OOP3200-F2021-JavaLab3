package ca.durhamcollege;

public class ExtendedWorkTicket extends WorkTicket
{
    //Declaration
    boolean myOpen;

    //ACCESSOR

    //Returns open status
    public boolean isOpen()
    {
        return myOpen;
    }

    //MUTATORS
    // Opens Work Ticket
    public void openTicket()
    {
        myOpen = true;
    }

    //Closes Work Ticket
    public void closeTicket()
    {
        myOpen = false;
    }

    // SetWorkTicket()
    public boolean SetWorkTicket(int ticketNumber, String clientId, int year, int month, int day, String issueDescription,
                                 boolean myOpen)
    {
        boolean isValid = true;

        if (myOpen != true)
        {
            isValid = false;
        }
        else {
            super.SetWorkTicket();
            this.myOpen = myOpen;
        }
        return isValid;
    }
}
