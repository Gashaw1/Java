/**
 * Created by User on 1/12/2017.
 */
public class DinnerPartyWithConstructor2 extends PartyWithConstructor2
{
    //private int dinnerChoice;


    public DinnerPartyWithConstructor2(int numGuests)
    {
        //super() is used to invoke immediate parent class constructor.
        super(numGuests);
    }
    //overrides the Party class method
    public void  displayInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }

}
