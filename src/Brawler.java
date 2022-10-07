public class Brawler extends Adventurer {

    // This counts as the Context Class ??

    public Behavior brawlBehavior;

    protected String name = "Brawler";
    public SearchBehavior searchBrawlBehavior;

    public Brawler(Behavior myBehavior, SearchBehavior mySearchBehavior){
        this.brawlBehavior = myBehavior;
        this.searchBrawlBehavior = mySearchBehavior;
    }

    public int executeStrategy(Room r1){
        return brawlBehavior.fight(r1);
    }
    public boolean executeSearchStrategy(Room r1){ return searchBrawlBehavior.search(r1);}

    public void publish(){
        Message myMess = new Message();
        myMess.setAdvRoom(Integer.toString(myAdvRoom.getRoom()));
        myMess.setAdvTreas(treasures);
        myMess.setName(name);
        notifyObserver(myMess);
    }
}



