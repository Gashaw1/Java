
import java.util.Scanner;

public class UseParty
{
    public static void main(String[] args)
    {
        int guests;
        Party aParty = new Party();
        Scanner keyborad = new Scanner(System.in);

        System.out.print("Enter number of guests for the party >>");
        guests = keyborad.nextInt();
        aParty.setGuests(guests);
        System.out.print("The party has " + aParty.getGusts() + " guests");
        aParty.displayInvitation();
    }
}
