import java.util.Random;

public class Quick implements SearchBehavior{
   public boolean search(Room r){
       Random rand = new Random();
       int skip = rand.nextInt(3) + 1;
       if(skip == 1){
           return false;
       }
       int rand1 = rand.nextInt(6) + 1;
       int rand2 = rand.nextInt(6) + 1;
       int intRandom = rand1 + rand2;
       if(intRandom >= 9){
           return true;
       }
       return false;
   }
}
