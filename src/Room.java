import java.util.ArrayList;
import java.util.List;
public class Room {
    // ROOM IS A GOOD EXAMPLE OF A COHESIVE CLASS
    // IT IS FOCUSED VERY CLEARLY AND ONLY HAS METHODS AND DATA RELATED TO THE ROOM OBJECT
    private boolean hasBrawler;
    private boolean hasSneaker;
    private boolean hasRunner;
    private boolean hasThief;
    private boolean hasOrbiter;
    private boolean hasSeeker;
    private boolean hasBlinker;
    private int room;

    public ArrayList<Treasure> treasures = new ArrayList<Treasure>(); //arraylist of treasures in rooms


    // THIS IS ALSO A GOOD EXAMPLE OF ENCAPSULATION
    // DATA AND METHODS ARE ALL CAPTURED HERE IN THE SAME CLASS WITH GETTERS AND SETTERS
    public Room(int roomNumber){
        hasBlinker = false;
        hasOrbiter = false;
        hasRunner = false;
        hasSeeker = false;
        hasBrawler = false;
        hasThief = false;
        hasSneaker = false;
        room = roomNumber;
    }

    public boolean isHasOrbiter(){
        return hasOrbiter;
    }

    public boolean isHasSeeker() {
        return hasSeeker;
    }

    public boolean isHasBlinker() {
        return hasBlinker;
    }

    public int getRoom() {
        return room;
    }

    public boolean isHasBrawler() {
        return hasBrawler;
    }

    public boolean isHasSneaker() {
        return hasSneaker;
    }

    public boolean isHasRunner() {
        return hasRunner;
    }

    public boolean isHasThief() {
        return hasThief;
    }

    public void setHasBrawler(boolean hasBrawler) {
        this.hasBrawler = hasBrawler;
    }

    public void setHasSneaker(boolean hasSneaker) {
        this.hasSneaker = hasSneaker;
    }

    public void setHasRunner(boolean hasRunner) {
        this.hasRunner = hasRunner;
    }

    public void setHasOrbiter(boolean hasOrbiter) {
        this.hasOrbiter = hasOrbiter;
    }

    public void setHasSeeker(boolean hasSeeker) {
        this.hasSeeker = hasSeeker;
    }

    public void setHasBlinker(boolean hasBlinker) {
        this.hasBlinker = hasBlinker;
    }

    public void setHasThief(boolean hasThief){
        this.hasThief = hasThief;
    }

    public void setRoom(int room) {

        this.room = room;
    }
}
