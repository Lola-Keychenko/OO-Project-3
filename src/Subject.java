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
    public void notifyObserver(){
        //get states of all classes
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).Update();
        }

    }
}
