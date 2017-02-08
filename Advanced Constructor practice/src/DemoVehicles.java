/**
 * Created by User on 2/7/2017.
 */
import javax.swing.*;
public class DemoVehicles {
    public static void  main(String[]  args)
    {
        Sailboat sailboat = new Sailboat();
        Bicycle bicycle = new Bicycle();
        JOptionPane.showMessageDialog(null, "\nVehicle description:\n " + sailboat.toString() +
        "\n" + "\n" + bicycle.toString());
    }
}
