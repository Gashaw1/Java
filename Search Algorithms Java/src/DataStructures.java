/**
 * Created by User on 12/20/2016.
 */
public class DataStructures {

    private int[] myArray = new int[5];
    private int arraySize = 5;

    int temp;

    //fill array with random number
    public void genRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void displayHorzontally() {
        System.out.print("Indexes");
        for (int i = 0; i < arraySize; i++) {

            System.out.print("   |    " + i);

        }
        System.out.println();
        System.out.print("         ---------------------------------------------");
        System.out.println();
        System.out.print("Values ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("   |   " + myArray[i]);
        }
        System.out.println("\n\n");
    }

    //Liner search
    public String linnearSearch(int value) {
        boolean boleanValue = false;

        String indexWithValue = "";

        System.out.print("Value was found the following indexes: ");
        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == value) {
                boleanValue = true;
                System.out.print(i + " ");
                indexWithValue += i + " ";
            }

        }
        if (!boleanValue) {

            indexWithValue = "None!";
            System.out.print(indexWithValue);
        }
        System.out.println();

        return indexWithValue;

    }

    //Bubble sort
    public void bubbleSort() {
        for (int index = 0; index < arraySize - 1; index++) {
            for (int i = 0; i < arraySize - 1; i++) {

                if (myArray[i] > myArray[i + 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;


                }
            }
        }

    }

    //binary search
    public void binarySearch(int userInput) {
        int middleValue = 0;
        int minValue = 0;
        int maxValue = arraySize - 1;

        while (minValue <= maxValue) {
            middleValue = (maxValue + minValue) / 2;

            if (myArray[middleValue] < userInput) {
                minValue = middleValue + 1;
            } else if (myArray[middleValue] > userInput) {
                maxValue = middleValue - 1;
            } else {
                System.out.print("\n Found a Match for " + userInput + "at index of " + middleValue + "\n");

                //break the loop
                minValue = maxValue + 1;
                break;
            }
        }
    }

    //Selection sort
    public void selectionSort() {

        for(int i =0; i < arraySize; i ++)
        {
            int min = i;
            for(int j = i; j < arraySize; j ++)
            {
                if(myArray[min] > myArray[j])
                {
                    min = j;
                }
            }
            int temp = myArray[i];
            myArray[i]= myArray[min];
            myArray[min] = temp;
        }
    }
    //Insertion sort
    public void insertionSort()
    {
        for(int i =0; i < arraySize; i ++)
        {
            int j = i;
            int toInsert = myArray[i];
            while((j > 0) &&(myArray[j-1] > toInsert)) {

                myArray[j] = myArray[j-1];
                j --;

            }
            myArray[j] = toInsert;
            }
        }
    }


