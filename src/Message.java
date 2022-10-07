import java.util.ArrayList;

/*
    THIS CLASS IS USED AS A STANDALONE OBJECT IN ORDER TO PASS AROUND INFORMATION FROM SUBJECT TO OBSERVER
 */

public class Message {

    private String advRoom;

    private int advDamage;

    public boolean isAdvWon() {
        return advWon;
    }

    public void setAdvWon(boolean advWon) {
        this.advWon = advWon;
    }

    public boolean isCreWon() {
        return creWon;
    }

    public void setCreWon(boolean creWon) {
        this.creWon = creWon;
    }

    private boolean advWon;

    private boolean creWon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private ArrayList<Treasure> advTreas;

    private String creRoom;

    public String getAdvRoom() {
        return advRoom;
    }

    public void setAdvRoom(String advRoom) {
        this.advRoom = advRoom;
    }

    public int getAdvDamage() {
        return advDamage;
    }

    public void setAdvDamage(int advDamage) {
        this.advDamage = advDamage;
    }

    public ArrayList<Treasure> getAdvTreas() {
        return advTreas;
    }

    public void setAdvTreas(ArrayList<Treasure> advTreas) {
        this.advTreas = advTreas;
    }

    public String getCreRoom() {
        return creRoom;
    }

    public void setCreRoom(String creRoom) {
        this.creRoom = creRoom;
    }

}