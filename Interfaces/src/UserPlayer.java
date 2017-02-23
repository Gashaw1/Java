/**
 * Created by User on 2/9/2017.
 * Program  gives an example of play in different category
 * userPlayer.java
 * Gashawbeza Amalto
 *
 */
public class UserPlayer {

     public static void main(String[] args)
    {
        Child child = new Child();
        Musician musician = new Musician();
        Actor actor = new Actor();

        child.play();
        System.out.println();
        musician.play();
        System.out.println();
        actor.play();
    }
}
