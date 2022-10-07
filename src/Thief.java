public class Thief extends Adventurer{
    // This counts as the Context Class ??

    public Behavior thBehavior;
    private String name = "Thief";

    public Thief(Behavior myBehavior){
        this.thBehavior = myBehavior;
    }

    public int executeStrategy(Room r1){
        return thBehavior.fight(r1);
    }

    public void publish(){
        Message myMess = new Message();
        myMess.setAdvRoom(Integer.toString(myAdvRoom.getRoom()));
        myMess.setAdvTreas(treasures);
        myMess.setName(name);
        notifyObserver(myMess);
    }


}
