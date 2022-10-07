import java.util.Random;

public class Runner extends Adventurer{
    // This counts as the Context Class ??

    public Behavior runBehavior;
    private String name = "Runner";

    public Runner(Behavior myBehavior){
        this.runBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return runBehavior.fight(r1);
    }

    public void publish(){
        Message myMess = new Message();
        myMess.setAdvRoom(Integer.toString(myAdvRoom.getRoom()));
        myMess.setAdvTreas(treasures);
        myMess.setName(name);
        notifyObserver(myMess);
    }
}
