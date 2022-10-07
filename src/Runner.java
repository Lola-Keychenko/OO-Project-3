import java.util.Random;

public class Runner extends Adventurer{
    // This counts as the Context Class ??

    public Behavior runBehavior;
    public SearchBehavior searchRunBehavior;

    public Runner(Behavior myBehavior, SearchBehavior mySearchBehavior){
        this.runBehavior = myBehavior;
        this.searchRunBehavior = mySearchBehavior;
    }

    public int executeStrategy(Room r1){
        return runBehavior.fight(r1);
    }
    public boolean executeSearchStrategy(Room r1){
        return searchRunBehavior.search(r1);
    }
}
