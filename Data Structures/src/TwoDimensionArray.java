/**
 * Created by User on 12/8/2016.
 */

public class TwoDimensionArray {

    int floor;
    int bedrooms;
    int avelalibeltyOnFloor = 0;
    int prices;
    int[][] rents = {
            {100, 333, 350,358,390,400},
            {444, 555, 600, 700},
            {555, 955, 939},
            {899,898,900,1001, 2008}
    };

    public void DisplayAll() {
        //loop
        for (floor = 0; floor < rents.length; ++floor) {

            for (bedrooms = 0; bedrooms < rents[floor].length; ++bedrooms) {
                avelalibeltyOnFloor = rents[floor].length;

                System.out.println("Bedrooms " + bedrooms + "  Rent is $" + rents[floor][bedrooms]);
            }
            System.out.println("On Floor " + floor + " there are " + avelalibeltyOnFloor + " resident \n");

        }
    }

    //
    public void SearchBYPrice(int inPrice) {
        int[] originalPrice = new int[5];
        int[] secondNum = new int[5];

        int afterM =0;
        for (floor = 0; floor < rents.length; ++floor) {

            for (bedrooms = 0; bedrooms < rents[floor].length; ++bedrooms) {
                avelalibeltyOnFloor = rents[floor].length;

                for (int i = 0; i < avelalibeltyOnFloor; i++)
                {
                    //return rent by floor
                    prices = rents[floor][bedrooms];
                    originalPrice[i] = prices;
                    secondNum[i] = prices - inPrice;

                }

            }
        }
    }
    public void getRange(int[]smalest, int[]heighest)
    {
        //
    }
    public static void main(String[] args)
    {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray();
        twoDimensionArray.DisplayAll();

    }
}
