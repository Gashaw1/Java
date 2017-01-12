import java.util.Scanner;


public class UseDinnerParty
{

    public static void main(String[] args)
    {
        int guests;
        int choice;
        //Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();

        Scanner keyborad = new Scanner(System.in);
        System.out.print("Enter number of guests for the party >>");
        guests = keyborad.nextInt();
        aDinnerParty.setGuests(guests);
        System.out.print("The party has " + aDinnerParty.getGusts() + " guests");
        aDinnerParty.displayInvitation();

        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyborad.nextInt();
        aDinnerParty.setGuests(guests);

        System.out.print("Enter the menu option --1 for chicken or 2 for beef >> ");
        choice = keyborad.nextInt();
        aDinnerParty.setDinnerChoice(choice);

        System.out.println("The dinner party has " + aDinnerParty.getGusts() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerchoice() + " will be served");

        aDinnerParty.displayInvitation();
    }
}
