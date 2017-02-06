/**
 * Created by User on 2/6/2017.
 */
import javax.swing.*;
public class Bicycle extends Sailboat {

    public Bicycle()
    {
       // super("a person", 2);
    }
    public void setPrice()
    {
        String entry;
        final int MAX = 40000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
        {
            price = MAX;

        }
    }

}
