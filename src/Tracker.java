
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tracker implements Observer{

    Message current = new Message();

    //arraylist w names of adv
    ArrayList<String> advNames = new ArrayList<>();
    //arraylist with room nums for adv
    ArrayList<Integer> advRooms = new ArrayList<>();
    ArrayList<Integer> advDamage = new ArrayList<>();
    ArrayList<ArrayList<Treasure>> advTreas = new ArrayList<>();

    //array of creatures rooms, will just take last four when giving info
    ArrayList<String> creatures = new ArrayList<>();

    public Tracker(){
        advNames.add("Brawler");
        advNames.add("Sneaker");
        advNames.add("Runner");
        advNames.add("Thief");
    }




    public void Update(Message newMess){

        // compare adv Room
        // compare adv damage
        // compare cre Room
        // compare adv treasures
        // save all info

        //IF THIS IS AN ADV UPDATE
        if(newMess.getName() != null){
            int index = -1;

            //find index of adv name
            for(int i = 0; i< advNames.size(); i++){
                if(newMess.getName() == advNames.get(i)){
                    index = i;
                    break;
                }
            }
            //update all info
            advRooms.set(index, Integer.parseInt(newMess.getAdvRoom())); //room
            advDamage.set(index, newMess.getAdvDamage()); //damage
            advTreas.set(index, newMess.getAdvTreas()); //treasure



        }else{ //THIS IS A CREATURE UPDATE
            creatures.add(newMess.getCreRoom());

        }

    }


    public void print(){
        //printing all adv stats

        System.out.println("Adventurers   Room   Damage   Treasure");

        for(int i = 0; i < advNames.size(); i++){
            System.out.print(advNames.get(i)+"   "+advRooms.get(i)+"   "+advDamage.get(i)+"   ");
            //print treasures
            for(int x = 0; x < advTreas.size(); x++){
                System.out.print(advTreas.get(i).get(x).getType()+" ");
            }
            System.out.println(""); //next line
        }

        //printing creature Roooms
        System.out.println("Creature Rooms");
        for(int i = creatures.size()-1; i>creatures.size()-13; i--){
            System.out.println(creatures.get(i));
        }
    }


}
