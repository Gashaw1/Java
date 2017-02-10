/**
 * Created by User on 2/7/2017.
 * Using a Superclass as a Method Parameter Type

 */
public class talkingAnimal {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cow cow = new Cow();

        dog.setName("ginger");
        cow.setName("Molly");

        talkingAnimal(dog);
        talkingAnimal(cow);
    }

    public static void talkingAnimal(Animal animal)
    {
        System.out.println("Come one. come all.");
        System.out.println("See the amazing talking animal !");
        System.out.println(animal.getName() + "  says");
        animal.speak();
        System.out.println("***********************");
    }
}
