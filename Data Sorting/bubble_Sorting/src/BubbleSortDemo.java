/**
 * Created by User on 11/28/2016.
 */

import java.util.*;

public class BubbleSortDemo {

    int a, b, temp;

    public void sortArray() {
        int[] someNum = new int[5];
        Scanner scanner = new Scanner(System.in);

        //add element to array till loop break
        for (int x = 0; x < someNum.length; x++) {

            //prompt end user
            System.out.print("Enter number " + (a + 1) + ">>");
            someNum[x] = scanner.nextInt();
            System.out.print("\n");

        }
        //sorting loop
        for (int i = 0; i < someNum.length - 1; i++) {
            for (int b = 0; b < someNum.length - 1; b++) {
                if (someNum[b] > someNum[b + 1]) {
                    temp = someNum[b];
                    someNum[b] = someNum[b + 1];
                    someNum[b + 1] = temp;
                }
            }
            //invoked the display method
            display(someNum, (i + 1));

        }
        System.out.print("\n");
        //Other way
        a = 1;
        while (a < someNum.length)
        {
            temp = someNum[a];
            b = a - 1;

            while (b >= 0 && someNum[b] > temp)
            {
                someNum[b + 1] = someNum[b];
                --b;
            }
            someNum[b + 1] = temp;
            display(someNum, a);
            ++a;
        }
    }

    //Display result
    public static void display(int[] someNums, int a) {

        System.out.print("Iteration " + a + ": ");
        for (int i = 0; i < someNums.length; i++) {
            System.out.print(someNums[i] + " : ");
        }
        System.out.println();
    }
}
