import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Blinker extends Creature{

    public Blinker(Room newRoom) {
        super(newRoom);
    }

    //Blinker Move:
    //Randomly move each turn to any Rooms across all levels
    public void Move(ArrayList<ArrayList<Room>> allRooms){
        //generate random number between 1-4 for floor
        Random rand = new Random();
        int floor = rand.nextInt(4) + 1;
        //generate random number for row
        int row = rand.nextInt(3);
        //generate random number for col
        int col = rand.nextInt(3);
        //put generated numbers together to make a room number
        int room = (floor*100)+(row*10)+(col);


        //match to room and move it blinker to it
        for(int i = 0; i<allRooms.get(floor).size(); i++){ //for the size of the array at that floor
            if(room == allRooms.get(floor).get(i).getRoom()){ //if the room number matches
                //remove blinker from room
                myRoom.setHasBlinker(false);
                //move blinker to new room
                myRoom = allRooms.get(floor).get(i);
                myRoom.setHasBlinker(true);
            }
        }
    }
}
