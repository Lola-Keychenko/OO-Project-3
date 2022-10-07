import java.util.Random;
public class Sneaker extends Adventurer{
    // This counts as the Context Class ??

    public Behavior sneakBehavior;

    public Sneaker(Behavior myBehavior){
        this.sneakBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return sneakBehavior.fight(r1);
    }
}
