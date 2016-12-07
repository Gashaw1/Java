/**
 * Created by User on 12/6/2016.
 */
public class Employee {

    private int empNum;
    private String lastName;
    private double salary;

    //set
    public void setEmpNum(int num)
    {
        empNum = num;
    }
    public void setLastName(String string)
    {
        lastName = string;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    //get
    public int getEmpNum()
    {
        return empNum;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getSalary()
    {
        return salary;
    }


    //Sample data
    int[] empNumArray = {1,2,4,5};
    String[] lastNameArray = {"Teddy","Jho","Selemone","Pit"};
    double[] salaryArray = {222.5,444.0,139.45,898.5};

    public void GetEmployee()
    {
        Employee[] employees={};
        for(int i = 0; i < empNumArray.length; i ++)
        {
            setEmpNum(empNumArray[i]);
            setLastName(lastNameArray[i]);
            setSalary(salaryArray[i]);

            employees[i].lastName =  getLastName();
        }

        bubbleSort(employees);
    }

    //Sort
    public void bubbleSort(Employee[] array)
    {
        Employee temp;

        for (int i = 0; i < array.length-1; ++i)
        {
               if(array[i].getSalary() > array[i +1].getSalary())
               {
                   temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
               }
        }
    }

}
