import java.util.Random;
public class Sneaker extends Adventurer{
    // 50% chance to not fight creature
    public boolean Special(){
        Random rand = new Random();
        int randInt = rand.nextInt(2) + 1;
        if(randInt == 1){
            // No fight
            return false;
        }else{
            // Fight
            return true;
        }
    }
}
