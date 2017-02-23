import java.util.Scanner;

/**
 * Created by User on 2/22/2017.
 * Gashawbeza amalto
 * Program display uses Service class method to display data
 *
 * This program prompt the user to choose to display the report from  highest to lowest or
 * from lowest to highest price
 */
public class SalonReport {

    Service service;
    String tempStr;
    double temp;
    int tempTime;


    String[] desc = {"Cut", "Shampoo", "Manicure", "Style", "Permanent", "Trim"};
    double[] price = {8.00, 4.00, 18.00, 48.00, 18.00, 6.00};
    int[] time = {15, 10, 30, 55, 35, 5};



    //sort by price asig order
    public void sortAsOrder()
    {

        for(int i = 0; i < price.length-1; i ++)
        {
            for(int b = 0; b < price.length - 1; b ++)
            {
                if(price[b] > price[b + 1])
                {
                    temp = price[b];
                    price[b] = price[b + 1];
                    price[b + 1] = temp;

                    tempStr = desc[b];
                    desc[b] =  desc[b+1];
                    desc[b+1] = tempStr;

                    tempTime = time[b];
                    time[b] = time[b + 1];
                    time[b+1] = tempTime;

                }
            }
        }
        displayAs(price, desc, time );
    }
    public void sortDesOrder()
    {

        for(int i = 0; i < price.length-1; i ++)
        {
            for(int b = 0; b < price.length - 1; b ++)
            {
                if(price[b] < price[b + 1])
                {
                    temp = price[b];
                    price[b] = price[b + 1];
                    price[b + 1] = temp;

                    tempStr = desc[b];
                    desc[b] =  desc[b+1];
                    desc[b+1] = tempStr;

                    tempTime = time[b];
                    time[b] = time[b + 1];
                    time[b+1] = tempTime;

                }
            }
        }
        displayAs(price, desc, time );
    }
    public void  displayAs(double[] pricesss, String[] descs, int[] time)
    {
        for(int i = 0; i < pricesss.length; i ++)
        {
            //Create reference for Service class an pass its constrictor argument
            service = new Service(descs[i],pricesss[i],time[i]);

            service.display();
        }
    }
    public static void main(String[] args)
    {

        SalonReport salonReport = new SalonReport();
        System.out.print("Enter (0) to lowest to highest price or enter (1) to highest to lowest price \n");
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i <= 10; i ++)
        {
            int userInput = scanner.nextInt();

            if (userInput == 0)
            {
                System.out.println("Display lowest to highest");
                System.out.println("_________________________________________________");
                System.out.printf("%-15.30s   %-15.30s  %-15.30s%n", "Descriptions", " Price($)", "Time (Minutes)");
                System.out.println("__________________________________________________");
                salonReport.sortAsOrder();
            } else if(userInput == 1)
            {

                System.out.println("Display highest to lowest");
                System.out.println("_________________________________________________");
                System.out.printf("%-15.30s   %-15.30s  %-15.30s%n", "Descriptions", " Price($)", "Time (Minutes)");
                System.out.println("__________________________________________________");

                salonReport.sortDesOrder();
            }
            else
                {
                    System.out.print("Tray again!");

                }
        }
        }

    }

