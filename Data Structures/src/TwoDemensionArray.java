/**
 * Created by User on 12/8/2016.
 */

import java.*;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class TwoDemensionArray {

    String entry;
    int floor;
    int bedrooms;

    int avelalibeltyOnFloor = 0;
    int[][] rents = {
            {100, 333},
            {444, 555, 600, 700},
            {555, 955, 939}
    };
    public void ShowRent()
    {
        //loop
        for (floor = 0; floor < rents.length; ++floor) {

            for (bedrooms = 0; bedrooms < rents[floor].length; ++bedrooms) {
                avelalibeltyOnFloor = rents[floor].length;

                System.out.println("Bedrooms " + bedrooms + "  Rent is $" + rents[floor][bedrooms]);
            }
            System.out.println("On Floor " + floor + " there are " + avelalibeltyOnFloor + " resident \n");

        }
    }

    public static void main(String[] args) {


            TwoDemensionArray twoDemensionArray = new TwoDemensionArray();



    }
}
