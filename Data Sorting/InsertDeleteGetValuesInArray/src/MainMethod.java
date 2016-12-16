/**
 * Created by User on 12/16/2016.
 */
public class MainMethod {

    public static void main(String[] args)
    {
        ArrayStructures arrayStructures = new ArrayStructures();
        arrayStructures.genRandomArray();
        arrayStructures.displayArray();

        //Original array
        System.out.println(arrayStructures.getValueAtIndex(3));
        //get value by index;
        System.out.println(arrayStructures.searchArray(3));

        //Deleted item by index
        arrayStructures.deleteIndex(3);
        arrayStructures.displayArray();

        //Insert new item after one item deleted
        arrayStructures.insertValue(3000);
        arrayStructures.displayArray();

        //Linear search
        arrayStructures.linnearSearch(18);
       // arrayStructures.displayArray();


    }
}
