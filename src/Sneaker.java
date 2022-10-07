import java.util.Random;
public class Sneaker extends Adventurer{
    // This counts as the Context Class ??

    public Behavior sneakBehavior;
    private String name = "Sneaker";

    public Sneaker(Behavior myBehavior){
        super();
        this.sneakBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return sneakBehavior.fight(r1);
    }

    public void publish(){
        Message myMess = new Message();
        myMess.setAdvRoom(Integer.toString(myAdvRoom.getRoom()));
        myMess.setAdvTreas(treasures);
        myMess.setName(name);
        notifyObserver(myMess);
    }
}
