public class Sword extends Treasure{

    public Sword() {

        type ="Sword";
    }

    //Sword does not need to know who has it, the adventurer does need to know if it has a sword

    //provides adventurer holding it with +1 bonus to all combat rolls against creature
    //should this be defined in this class? maybe I need a function that is just called special() and is called immediately upon request?
}
