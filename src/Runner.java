import java.util.Random;

public class Runner extends Adventurer{
    // This counts as the Context Class ??

    public Behavior runBehavior;

    public Runner(Behavior myBehavior){
        this.runBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return runBehavior.fight(r1);
    }
}
