
public class DinnerParty2 extends Party {

    private int dinnerChoice;
    public  int getDinnerchoice()
    {
        return dinnerChoice;
    }
    public void setDinnerChoice(int choice)
    {
        dinnerChoice = choice;
    }

    //overrides the Party class method
    public void  displayInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }
}
