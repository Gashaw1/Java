/**
 * Created by User on 12/8/2016.
 */

public class TwoDimensionArray {

    String entry;
    int floor;
    int bedrooms;
    int avelalibeltyOnFloor = 0;
    int prices;
    int[][] rents = {
            {100, 333},
            {444, 555, 600, 700},
            {555, 955, 939}
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

    public void SearchBYPrice() {
        for (floor = 0; floor < rents.length; ++floor) {

            for (bedrooms = 0; bedrooms < rents[floor].length; ++bedrooms) {
                avelalibeltyOnFloor = rents[floor].length;

                for (int i = 0; i < avelalibeltyOnFloor; i++) {
                    //return rent by floor
                    prices = rents[floor][bedrooms];

                }

            }
        }
    }

    public static void main(String[] args) {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray();

        twoDimensionArray.SearchBYPrice();
    }
}
