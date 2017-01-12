/**
 * Created by User on 1/12/2017.
 * PartyWithConstructor.java
 * Understanding the Role of Constructors in Inheritance
 */
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

    public PartyWithConstructor()
    {
        System.out.println("Creating a Party");
    }
}
