/**
 * Created by User on 2/6/2017.
 */
import javax.swing.*;
public class Bicycle extends Vehicle {

    public Bicycle()
    {
       super("a person", 2);
    }
    public void setPrice()
    {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
        {
            price = MAX;

        }
    }
    public String toString()
    {
        return ("The bicycle is power by " + getPowerSource() +

        " ; it has " + getWheels() + " wheels and consts $" + getPrice());
    }

}
