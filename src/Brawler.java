public class Brawler extends Adventurer {

    // This counts as the Context Class ??

    public Behavior brawlBehavior;
    private String name = "Brawler";

    public Brawler(Behavior myBehavior){
        this.brawlBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return brawlBehavior.fight(r1);
    }

    public void publish(){
        Message myMess = new Message();
        myMess.setAdvRoom(Integer.toString(myAdvRoom.getRoom()));
        myMess.setAdvTreas(treasures);
        myMess.setName(name);
        notifyObserver(myMess);
    }
}
