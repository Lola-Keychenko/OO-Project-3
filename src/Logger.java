//NOTES FOR OBSERVER
// Event consumer class called a logger
// Logger object should be instantiated at the beginning of each full Adventurer/Creature
//turn and should close at the end of each turn.
//should write in human readable form
//
/* EVENTS TO PUBLISH/SUBSCRIBE TO
 Adventurer/Creature enters room
 Adventurer/Creature wins/loses combat
 Adventurer celebrates
 Adventurer damage points change
 Adventurer/Creature is defeated/removed
 Treasure is found by Adventurer (include type of treasure)
 */

public class Logger implements Observer{
    //In order to observe fights, rooms, damage,treasure and removal?
    public void Update(){

    }
}
