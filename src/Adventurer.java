import java.util.ArrayList;
import java.util.Random;

public class Adventurer{
    private Room myAdvRoom;
    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();
    private int damage;


    public Adventurer(){
        damage = 0;
        // All initialized Adventurers start in room number 011
        Room newRoom = new Room(011);
        myAdvRoom = newRoom;
    }

    //Overload for when instantiating adventurer with a room already assigned
    public Adventurer(Room myRoom){
        damage = getDamage();
        myAdvRoom = myRoom;
    }

    public int Roll(){
        Random rand = new Random();
        int rand1 = rand.nextInt(6) + 1;
        int rand2 = rand.nextInt(6) + 1;
        int intRandom = rand1 + rand2;
        return intRandom;
    }

    //Method to compare treasure arraylists with room to see if adv already has a treasure
    public void compareTreasures(ArrayList<Treasure> roomTreasures){
        //takes all treasures from rooms arraylist that the adv does not already have
        //use index of to check, returns -1 if there is no instance of it
        boolean hasTreasureType = false;

        //loop through all objects in roomTreasures array
        for(int i = 0; i < roomTreasures.size(); i++){
            //loop through all objs in adv treasures array
            for(int j = 0; j < treasures.size(); j++){
                //if the treasure object is the same type as any in adv array
                if(roomTreasures.get(i).getType() == treasures.get(j).getType()){
                    hasTreasureType = true;
                    break;
                }
            }
            if(hasTreasureType == false){
                //add treasure to adv arraylist
                treasures.add(roomTreasures.get(i));
                //remove treasure from rooms arraylist
                roomTreasures.remove(roomTreasures.get(i));
                //set the index of i back one
                i--;
            }
        }
    }

    // Getters
    public Room getMyRoom(){
        return myAdvRoom;
    }
    public int getDamage(){
        return damage;
    }

    // Setters
    public void setMyRoom(Room myRoom) {
        this.myAdvRoom = myRoom;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Finds what position the adventurer is in 
    public int setNewRoom(int currentRoom){
        // Check if I'm in a starting room
        if(currentRoom== 011){
            // Can only move U 
            return currentRoom+100;
        } else if(currentRoom == 411){
            // Room 411 is the top, so can move everywhere except up.
            Random rand = new Random();
            int randomInt = rand.nextInt(5) + 2;
            if(randomInt == 2){ // Move D
                return currentRoom - 100;
            }else if(randomInt == 3){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 4){ // Move N
                return currentRoom - 10;
            }else if(randomInt == 5){ // Move E
                return currentRoom + 1;
            }else if(randomInt == 6){ // Move W
                return currentRoom - 1;
            }
        //TOP ROW MOVEMENTS
        } else if(currentRoom % 100 == 0){
            // Top left corner rooms -> can move E and S
            Random rand = new Random();
            int randomInt = rand.nextInt(2) + 1;
            if(randomInt == 1){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 2){ // Move E
                return currentRoom + 1;
            }
        } else if(currentRoom % 100 == 1){
            // Top middle rooms -> can move E/W/S
            Random rand = new Random();
            int randomInt = rand.nextInt(3) + 1;
            if(randomInt == 1){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 2){ // Move E
                return currentRoom + 1;
            }else if(randomInt == 3){ // Move W
                return currentRoom - 1;
            }
        }else if(currentRoom % 100 == 2){
            // Top right corner rooms -> can move W and S
            Random rand = new Random();
            int randomInt = rand.nextInt(2) + 1;
            if(randomInt == 1){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 2){ // Move W
                return currentRoom - 1;
            }
        // CENTER ROW MOVEMENTS
        }else if(currentRoom % 100 == 10){
            // Middle left rooms -> can move N/S/E
            Random rand = new Random();
            int randomInt = rand.nextInt(3) + 1;
            if(randomInt == 1){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 2){ // Move E
                return currentRoom + 1;
            }else if(randomInt == 3){ // Move N
                return currentRoom - 10;
            }
        }else if(currentRoom % 100 == 11 && currentRoom != 211){
            // Center room -> Can move N/S/E/W/U/D
            Random rand = new Random();
            int randomInt = rand.nextInt(6) + 1;
            if(randomInt == 1){ // Move U
                return currentRoom + 100;
            } else if(randomInt == 2){ // Move D
                return currentRoom - 100;
            }else if(randomInt == 3){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 4){ // Move N
                return currentRoom - 10;
            }else if(randomInt == 5){ // Move E
                return currentRoom + 1;
            }else if(randomInt == 6){ // Move W
                return currentRoom - 1;
            }
        }else if(currentRoom % 100 == 11){
            // Center room -> Can move N/S/E/W/U/D
            Random rand = new Random();
            int randomInt = rand.nextInt(6) + 1;
            if(randomInt == 1){ // Move U
                return currentRoom + 100;
            }else if(randomInt == 3){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 4){ // Move N
                return currentRoom - 10;
            }else if(randomInt == 5){ // Move E
                return currentRoom + 1;
            }else if(randomInt == 6){ // Move W
                return currentRoom - 1;
            }
        }else if(currentRoom % 100 == 12){
            // Middle right rooms -> can move N/S/W
            Random rand = new Random();
            int randomInt = rand.nextInt(3) + 1;
            if(randomInt == 1){ // Move S
                return currentRoom + 10;
            }else if(randomInt == 2){ // Move W
                return currentRoom - 1;
            }else if(randomInt == 3){ // Move N
                return currentRoom - 10;
            }
        //BOTTOM ROW MOVEMENTS
        } else if(currentRoom % 100 == 20){
            // Bottom left corner rooms -> can move E and U
            Random rand = new Random();
            int randomInt = rand.nextInt(2) + 1;
            if(randomInt == 1){ // Move N
                return currentRoom - 10;
            }else if(randomInt == 2){ // Move E
                return currentRoom + 1;
            }
        } else if(currentRoom % 100 == 21){
            // Bottom middle rooms -> can move E/W/U
            Random rand = new Random();
            int randomInt = rand.nextInt(3) + 1;
            if(randomInt == 1){ // Move N
                return currentRoom - 10;
            }else if(randomInt == 2){ // Move E
                return currentRoom + 1;
            }else if(randomInt == 3){ // Move W
                return currentRoom - 1;
            }
        }else if(currentRoom % 100 == 22){
            // Bottom right corner rooms -> can move W and U
            Random rand = new Random();
            int randomInt = rand.nextInt(2) + 1;
            if(randomInt == 1){ // Move N
                return currentRoom - 10;
            }else if(randomInt == 2){ // Move W
                return currentRoom - 1;
            }
        }
        return 0;
    }

}
