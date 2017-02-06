/**
 * Created by User on 2/6/2017.
 */
import javax.swing.*;
public class Sailboat extends Vehicle
{

    private int length;
    public Sailboat()
    {
        //reference Vehicle construrtor
        super("wind", 0);
        setLength();
    }
    public void setLength()
    {
        String entry;
        entry = JOptionPane.showInputDialog(null,"Enter sailboadt length in feet ");
        length = Integer.parseInt(entry);
    }
    public int getLength()
    {
        return length;
    }
    public void setPrice()
    {
        String entry;
        final int MAX = 10000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
        price = Integer.parseInt(entry);
        if(price > MAX)
        {
            price = MAX;
        }

    }//override builting method
    public String toString()
    {
        return ("The  "
                + getLength() + " foot sailboat is powered by "
                + getPowerSource() + "; it has "
                + getWheels() + " wheels and cost $"
                + getPrice());
    }
}
