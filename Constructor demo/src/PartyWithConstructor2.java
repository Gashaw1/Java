/**
 * Created by User on 1/12/2017.
 */
public class PartyWithConstructor2 {

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
    public PartyWithConstructor2(int numGuests)
    {
        quests = numGuests;
    }
}
