/**
 * Created by User on 2/7/2017.
 */
public abstract class Animal {

    private String name;
    public abstract void speak();

    public String getName()
    {
        return name;
    }
    public void setName(String animalName)
    {
        name = animalName;
    }
}
