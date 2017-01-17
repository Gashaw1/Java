/**
 * Created by User on 1/12/2017.
 * This application creates only one child class object:
 */

import java.util.Scanner;
public class UseDinnerPartyWithConstructor
{
    public static void main(String[] args)
    {
        int guests;
        int choice;

        Scanner keyborad = new Scanner(System.in);

        System.out.print("Enter number of guests for the party >>");

        guests = keyborad.nextInt();

        DinnerPartyWithConstructor2 aDinnerPartyWithConstructor = new DinnerPartyWithConstructor2(guests);
       // aDinnerPartyWithConstructor.setGuests(guests);

        System.out.print("The party has " + aDinnerPartyWithConstructor.getGusts() + " guests");

        aDinnerPartyWithConstructor.displayInvitation();



        System.out.print("Enter number of guests for the dinner party >> ");

        guests = keyborad.nextInt();

        aDinnerPartyWithConstructor.setGuests(guests);



        System.out.print("Enter the menu option --1 for chicken or 2 for beef >> ");

        choice = keyborad.nextInt();

        //aDinnerParty.setDinnerChoice(choice);



        System.out.println("The dinner party has " + aDinnerPartyWithConstructor.getGusts() + " guests");

       // System.out.println("Menu option " + aDinnerParty.getDinnerchoice() + " will be served");



       // aDinnerPartyWithConstructor.displayInvitation();
    }
}
