public class Dance extends celebrationDecorator{
    Behavior behavior; //instance variable to hold the behavior we are wrapping

    public Dance(Behavior behavior){
        this.behavior = behavior; //a way to set the instance variable to the object we are wrapping
        //pass the behavior we are wrapping to the decorators constructor
    }

    public int fight(Room r){
        //do extended behavior
        System.out.println("Dance!");
        return 1;
    }
}

