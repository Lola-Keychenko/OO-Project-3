//NOTES FOR OBSERVER
// Event consumer class called a logger
// Logger object should be instantiated at the beginning of each full Adventurer/Creature
//turn and should close at the end of each turn.
//should write in human readable form

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

import java.util.ArrayList;

public class Logger implements Observer{

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

    //constructor w/text file name to write to
    String turn;
    public Logger(String newTurn){
        turn = newTurn;
    }

    Message current = new Message();
    public void Update(Message newMess){

        // compare adv Room
        // compare adv damage
        // compare cre Room
        // compare adv treasures
        // Print anything new it has !

        String toLog = "";
        String txtFileName = "C:\\src\\logger-"+turn+".txt";

        System.out.println("Update in Logger was called");

        if(current.getAdvRoom() != null){
            toLog = current.getName()+" has entered room "+current.getAdvRoom();
        } else if(current.getAdvDamage() != -1){
            toLog = current.getName()+" has damage of "+current.getAdvDamage();
        } else if(current.getCreRoom() != null){
            toLog = "Creature has entered room "+current.getCreRoom();
        } else if(current.getAdvTreas() != null){
            toLog = current.getName()+" has these treasures now: ";
            //go through treasures and add as string to sentence
            for(int i = 0; i < current.getAdvTreas().size(); i++){
                toLog = toLog+" "+current.getAdvTreas().get(i).getType();
            }
        }

        //print to a txt file;
        logging(txtFileName, toLog);

    }


    public static void logging(String fileName, String toLog) {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter(fileName);
                myWriter.write(toLog);
                myWriter.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //FILE WRITING CITATIONS:
    //https://www.w3schools.com/java/java_files_create.asp

}
