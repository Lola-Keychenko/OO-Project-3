public class Thief extends Adventurer{
    // This counts as the Context Class ??

    public Behavior thBehavior;
    public SearchBehavior searchthBehavior;

    public Thief(Behavior myBehavior, SearchBehavior mySearchBehavior){
        this.thBehavior = myBehavior;
        this.searchthBehavior = mySearchBehavior;
    }

    public int executeStrategy(Room r1){
        return thBehavior.fight(r1);
    }
    public boolean executeSearchBehavior(Room r1){
        return searchthBehavior.search(r1);
    }
}
