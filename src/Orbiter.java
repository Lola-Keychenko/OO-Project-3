import java.util.ArrayList;
import java.util.List;
public class Orbiter extends Creature{

    public Orbiter(Room newRoom) {
        super(newRoom);
    }

    public Room findRoom(int num, ArrayList<ArrayList<Room>> allRooms){
        for(int i = 0; i<allRooms.get(num/100).size(); i++){
            if(num == allRooms.get(num/100).get(i).getRoom()){
                return allRooms.get(num/100).get(i);
            }
        }
        return null;
    }

    //Makes Orbiter Move:
    //circles the outer rooms of the level orbiter is on, whether connected or not
    public void Move(ArrayList<ArrayList<Room>> allRooms){
        //arraylist of order of rooms
        ArrayList<Integer> orderOfRooms = new ArrayList<Integer>();
        orderOfRooms.add(0);
        orderOfRooms.add(1);
        orderOfRooms.add(2);
        orderOfRooms.add(12);
        orderOfRooms.add(22);
        orderOfRooms.add(21);
        orderOfRooms.add(20);
        orderOfRooms.add(10);

        //find index of my room
        int roomNum = myRoom.getRoom();
        int floor = (int)(roomNum/100);
        roomNum = roomNum%100;
        int index = orderOfRooms.indexOf(roomNum);

        //if the index is not 8
        if(index != 7){
            roomNum = orderOfRooms.get(index+1);
        }else{
            roomNum = orderOfRooms.get(0);
        }

        //reassign room
        myRoom.setHasOrbiter(false);
        myRoom = findRoom((floor*100)+roomNum, allRooms);
        myRoom.setHasOrbiter(true);
    }

}
