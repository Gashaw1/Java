

//1/17/2017`
//Calling Constructors During Inheritance and
//overrides the PartyWithConstructor class method
public class DinnerPartyWithConstructor extends PartyWithConstructor {

    private int dinnerChoice;
    public  int getDinnerchoice()
    {
        return dinnerChoice;
    }
    public void setDinnerChoice(int choice)
    {
        dinnerChoice = choice;
    }
    //overrides the PartyWithConstructor class method
    public void  displayInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }
}
