public interface Behavior {
    int fight(Room r);
}

//we can use the same way the book did it and call the actual decorator and pass in an object of the specific fight method

// This is interface not public abstract class and public abstract int