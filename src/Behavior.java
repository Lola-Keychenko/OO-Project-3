
public abstract class Behavior extends Subject {
    public abstract void fight(Room r);
}

//we can use the same way the book did it and call the actual decorator and pass in an object of the specific fight method

/*WHAT Information am I publishing from here ?
    - fights/ who wins a fight
    - celebrations
    - damage points change w/in fight
    - adv/cre defeated/removed
 */
