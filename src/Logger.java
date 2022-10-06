//NOTES FOR OBSERVER
// Event consumer class called a logger
// Logger object should be instantiated at the beginning of each full Adventurer/Creature
//turn and should close at the end of each turn.
//should write in human readable form

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;

public class Logger implements Observer{
    //In order to observe fights, rooms, damage,treasure and removal?
    int turn = 0;
    public void Update(){
        //CALLED WHEN SUBJ HAS NEW INFORMATION FOR THE OBSERVER
        //get all the information we need to write to a text file
        /*
         Adventurer/Creature enters room
         Adventurer/Creature wins/loses combat
         Adventurer celebrates
         Adventurer damage points change
         Adventurer/Creature is defeated/removed
         Treasure is found by Adventurer (include type of treasure)
         */

        String whoEnteredRooms = "";
        //go through all adventurers and write down room nums
        //go through all creatures and write down room nums


    }

    public class CreateFile {
        String name = "Logger - "+turn+".txt";
        public static void main(String[] args) {
            try {
                File myObj = new File(name);
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
