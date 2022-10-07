import java.util.Random;

public class Careless implements SearchBehavior{
    public boolean search(Room r) {
        Random rand = new Random();
        int rand1 = rand.nextInt(6) + 1;
        int rand2 = rand.nextInt(6) + 1;
        int intRandom = rand1 + rand2;
        if(intRandom >= 10){
            return true;
        }
        return false;
    }
}
