import java.util.ArrayList;
public class Subject {
    // THIS IS THE SUBJECT INTERFACE FOR ALL PUBLISHERS

    //ArrayLists for all Observers
    ArrayList<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer newObs){
        //adding
        observers.add(newObs);
    }
    public void removeObserver(Observer oldObs){
        //deleting
        observers.remove(oldObs);
    }
    public void notifyObserver(Message myMess) {
        //gathering all data to give to observer
        //arraylist of room numbers for creatures
        //arraylist of room numbers for adv


        //get states of all classes
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).Update(myMess);
        }
    }

        //having a method to publish events where it gets called by a subject when there is something new to report
        // the method will get____() all info it needs and then call notify observer

        /*
         Adventurer/Creature enters room
         Adventurer/Creature wins/loses combat
         Adventurer celebrates
         Adventurer damage points change
         Adventurer/Creature is defeated/removed
         Treasure is found by Adventurer (include type of treasure)
         */

}
