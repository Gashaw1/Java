

public class Service {

    private String serviceDescriptions;
    private Double price;
    private int time;

    //Consturctor
    public Service(String serviceDescriptions, Double price, int time)
    {
        this.serviceDescriptions = serviceDescriptions;
        this.price = price;
        this.time = time;
    }
    public String getSerciveDescription()
    {
        return serviceDescriptions;
    }
    public Double getPrice()
    {
        return price;
    }
    public int getTime()
    {
        return time;
    }
    public void display()
    {
        System.out.printf("%-20.30s   %-20.30s  %-20.30s%n", getSerciveDescription(), getPrice(), getTime());
    }




}
