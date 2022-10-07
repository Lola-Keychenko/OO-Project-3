public class Spin extends celebrationDecorator{
    Behavior behavior; //instance variable to hold the behavior we are wrapping

    public Spin(Behavior behavior){
        this.behavior = behavior; //a way to set the instance variable to the object we are wrapping
        //pass the behavior we are wrapping to the decorators constructor
    }

    public int fight(Room r){
        //do extended behavior
        System.out.println("Spin!");
        return 1;
    }
}
