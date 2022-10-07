public class Thief extends Adventurer{
    // This counts as the Context Class ??

    public Behavior thBehavior;

    public Thief(Behavior myBehavior){
        this.thBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return thBehavior.fight(r1);
    }


}
