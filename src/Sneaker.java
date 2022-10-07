import java.util.Random;
public class Sneaker extends Adventurer{
    // This counts as the Context Class ??

    public Behavior sneakBehavior;
    public SearchBehavior searchSneakBehavior;

    public Sneaker(Behavior myBehavior, SearchBehavior mySearchBehavior){
        this.sneakBehavior = myBehavior;
        this.searchSneakBehavior = mySearchBehavior;
    }

    public int executeStrategy(Room r1){
        return sneakBehavior.fight(r1);
    }

    public boolean executeSearchStrategy(Room r1){
        return searchSneakBehavior.search(r1);
    }
}
