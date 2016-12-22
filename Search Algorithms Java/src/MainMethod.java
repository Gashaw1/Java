/**
 * Created by User on 12/20/2016.
 */
public class MainMethod {

    public static void main(String[] args)
    {
        DataStructures dataStructures = new DataStructures();

        //fill array
        dataStructures.genRandomArray();
        dataStructures.displayHorzontally();

        //linear search
        dataStructures.linnearSearch(14);
        dataStructures.displayHorzontally();

//        //Bubble sort
//        System.out.print("After bubble sort \n");
//        dataStructures.bubbleSort();
//        dataStructures.displayHorzontally();

       //Bineary Search
        dataStructures.binarySearch(12);
        dataStructures.displayHorzontally();

        System.out.print("After Selection sort \n");
        dataStructures.selectionSort();
        dataStructures.displayHorzontally();
    }
}
