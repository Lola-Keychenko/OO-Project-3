import java.util.ArrayList;
import java.util.List;

public class Seeker extends Creature{
    // THIS CLASS IS AN EXAMPLE OF INHERITANCE. IT INHERITS FROM CREATURE
    public Seeker(Room newRoom) {
        super(newRoom);
    }

    public Room findRoom(int num, ArrayList<ArrayList<Room>> allRooms){
        for(int i = 0; i<allRooms.get(num/100).size(); i++){
            ArrayList<Room> floor = allRooms.get(num/100);
            if(num == floor.get(i).getRoom()){
                return allRooms.get(num/100).get(i);
            }
        }
        return null;
    }

    public Boolean hasAdventurer(int num, ArrayList<ArrayList<Room>> allRooms){
        Room r = findRoom(num, allRooms);
        if(r.isHasBrawler() || r.isHasSneaker() || r.isHasRunner() || r.isHasThief()){
            return true;
        }
        return false;
    }

    //Seeker Move:
    //Move to join any adjacent Adventurer on their level
    //If there are no adventurers adjacent or adventurer in room, do not move

    // THIS IS AN EXAMPLE OF POLYMORPHISM. OTHER CREATURE SUBCLASSES HAVE MOVE METHODS BUT THEY ARE DIFFERENT
    public void Move(ArrayList<ArrayList<Room>> allRooms) {
        int currRoom = myRoom.getRoom();
        int lastTwo = currRoom%10;
        int nextRoom = -1;

        //if adv already in room
        if(myRoom.isHasSneaker() || myRoom.isHasThief() || myRoom.isHasRunner() || myRoom.isHasBrawler()){
            return;
        }

        if(lastTwo== 00){ //upper left: ES
            if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else{
                return;
            }
        }else if(lastTwo == 01){ //upper mid: WSE
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else{
                return;
            }
        }else if(lastTwo == 02){ //upper right: WS
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else{
                return;
            }
        }else if(lastTwo == 10){ //mid left: NES
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else{
                return;
            }
        }else if(lastTwo == 12){ //mid right:NWS
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else{
                return;
            }
        }else if(lastTwo == 20){ //low left: NE
            if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else{
                return;
            }
        }else if(lastTwo == 21){ //low mid: WNE
            if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else{
                return;
            }
        }else if(lastTwo == 22){ //low right: WN
            if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else{
                return;
            }
        }else if(currRoom == 211 || currRoom == 311){ //mid mid: NSEW Up Down
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom+100, allRooms)){ //UP
                nextRoom = currRoom+100;
            }else if(hasAdventurer(currRoom-100, allRooms)){ //DOWN
                nextRoom = currRoom-100;
            }else{
                return;
            }
        }else if(currRoom == 111){ //NSEW UP
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom+100, allRooms)){ //UP
                nextRoom = currRoom+100;
            }else{
                return;
            }
        }else if(currRoom == 411){ //NSEW DOWN
            if(hasAdventurer(currRoom+10, allRooms)){ //SOUTH
                nextRoom = currRoom+10;
            }else if(hasAdventurer(currRoom-10, allRooms)){ //NORTH
                nextRoom = currRoom-10;
            }else if(hasAdventurer(currRoom-1, allRooms)){ //WEST
                nextRoom = currRoom-1;
            }else if(hasAdventurer(currRoom+1, allRooms)){ //EAST
                nextRoom = currRoom+1;
            }else if(hasAdventurer(currRoom-100, allRooms)){ //DOWN
                nextRoom = currRoom-100;
            }else{
                return;
            }
        }else if(currRoom == 011){ //UP
            if(hasAdventurer(currRoom+100, allRooms)){ //UP
                nextRoom = currRoom+100;
            }else{
                return;
            }
        }

        //reassign room
        myRoom.setHasSeeker(false);
        myRoom = findRoom(nextRoom, allRooms);
        myRoom.setHasSeeker(true);
    }
}
