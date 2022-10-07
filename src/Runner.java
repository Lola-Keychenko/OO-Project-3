import java.util.Random;

public class Runner extends Adventurer{
    // This counts as the Context Class ??

    public Behavior runBehavior;

    protected String name = "Runner";
    
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
    /*
    public void publish(){
        Message myMess = new Message();
        myMess.setAdvRoom(Integer.toString(myAdvRoom.getRoom()));
        myMess.setAdvTreas(treasures);
        myMess.setName(name);
        notifyObserver(myMess);
    }
     */
}

