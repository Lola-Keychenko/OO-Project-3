import java.util.Random;

public class Stealth extends Behavior {
    //Stealth - has a 50% chance of avoiding combat for each creature engaged, no bonus to 2 dice roll for fighting a creature

    // Return 0 if tie/no fight, return 1 if Adventure win, return 2 if Creature win
    public int fight(Room r){
        System.out.println("Fighting in Stealth");
        Random rand = new Random();
        // Determine if the adventurer will avoid combat
        if(r.isHasSeeker() || r.isHasBlinker() || r.isHasOrbiter()){
            // random number either 0 or 1.    1 means no fight, 0 means fight
            int rand1 = rand.nextInt(2);
            if(rand1 == 1){
                return 0;
            }
        }
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
