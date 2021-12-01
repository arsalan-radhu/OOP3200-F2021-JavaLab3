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
}
