import java.util.Random;
import java.util.*;
import java.util.ArrayList;
public abstract class celebrationDecorator extends Behavior{
    //public abstract String getCelebration();
    public abstract int fight(Room r);
}


//NOTES FOR OBSERVER
// Event consumer class called a logger
// Logger object should be instantiated at the beginning of each full Adventurer/Creature
//turn and should close at the end of each turn.
//should write in human readable form
//
//Create an event consumer class called a Tracker
// The Tracker object will be instantiated at the beginning of
//the simulation run and stay active until the end.
//The Tracker will subscribe for the published events and
//maintain a data structure in memory for current game status.
// At the end of each day the Tracker should
//print a summary of the cumulative data

/* EVENTS TO PUBLISH
 Adventurer/Creature enters room
 Adventurer/Creature wins/loses combat
 Adventurer celebrates
 Adventurer damage points change
 Adventurer/Creature is defeated/removed
 Treasure is found by Adventurer (include type of treasure)
 */