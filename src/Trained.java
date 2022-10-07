import java.util.Random;

public class Trained implements Behavior{
    //Trained - gains +1 to 2 dice roll for fighting a creature
    public int fight(Room r){
        Random rand = new Random();
        // Determine if the adventurer will avoid combat
        int aRand1 = rand.nextInt(6) + 1;
        int aRand2 = rand.nextInt(6) + 1;
        int cRand1 = rand.nextInt(6) + 1;
        int cRand2 = rand.nextInt(6) + 1;
        int aRoll = aRand1 + aRand2 + 1; // This is the "Trained" special
        int cRoll = cRand1 + cRand2;

        if(aRoll > cRoll){
            // Adventurer win
            return 1;
        }else if(cRoll > aRoll){
            // Creature win
            return 2;
        }else if(cRoll == aRoll){
            // Tie
            return 0;
        }
        return 0;
    }
}
