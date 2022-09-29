import java.util.Random;
public class Creature {
    // THESE PROTECTED VARIABLES ARE GOOD EXAMPLES OF ABSTRACTION
    // THEY ARE AVAILABLE TO THE SUBCLASSES OF THIS SUPERCLASS BUT NOT OTHER ONES
    protected Room myRoom; //creatures room
    protected int damage; //creatures damage so far

    //Constructor
    public Creature(Room newRoom){
        myRoom = newRoom;
        damage = 0;
    }

    //Make Creature Roll 1-6 on two dice
    public int Roll(){
        Random rand = new Random();
        int rand1 = rand.nextInt(6) + 1;
        int rand2 = rand.nextInt(6) + 1;
        int intRandom = rand1 + rand2;
        return intRandom;
    }

    //getters
    public Room getMyRoom(){
        return myRoom;
    }

    public int getDamage(){
        return damage;
    }

    //setters
    //Command+N creates getters and setters faster
    public void setMyRoom(Room myRoom) {
        this.myRoom = myRoom;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
