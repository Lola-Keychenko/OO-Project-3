public class Brawler extends Adventurer {

    // This counts as the Context Class ??

    public Behavior brawlBehavior;

    public Brawler(Behavior myBehavior){
        this.brawlBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return brawlBehavior.fight(r1);
    }
}
