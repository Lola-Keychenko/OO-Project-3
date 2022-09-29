import java.util.Random;

public class Runner extends Adventurer{
    public int Special(){
        Random rand = new Random();
        int aRand1 = rand.nextInt(6) + 1;
        int aRand2 = rand.nextInt(6) + 1;
        int cRand1 = rand.nextInt(6) + 1;
        int cRand2 = rand.nextInt(6) + 1;
        int aRoll = aRand1 + aRand2;
        int cRoll = cRand1 + cRand2;

        if(aRoll > cRoll){
            return 1;
        }else if(cRoll > aRoll){
            return 2;
        }else{
            return 3;
        }
    }
}
