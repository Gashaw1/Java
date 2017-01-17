

//Createing PartyWithConstructor class for other program to use it
//Modified 1/17/2017
public class PartyWithConstructor {

    private int quests;

    public int getGusts()
    {
        return quests;
    }
    public void setGuests(int numGuests)
    {
        quests = numGuests;
    }
    public void displayInvitation()
    {
        System.out.println(" Please come to my party!");
    }
    //Constructor
    public PartyWithConstructor()
    {
        System.out.println("Createing a Party");
    }
}
