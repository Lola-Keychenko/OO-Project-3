import java.util.Random;

public class Untrained implements Behavior{
    //Untrained - no special here - just a regular fight
    public int fight(Room r){
        Random rand = new Random();
        int aRand1 = rand.nextInt(6) + 1;
        int aRand2 = rand.nextInt(6) + 1;
        int cRand1 = rand.nextInt(6) + 1;
        int cRand2 = rand.nextInt(6) + 1;
        int aRoll = aRand1 + aRand2;
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
