public class Shout extends celebrationDecorator{
    Behavior behavior; //instance variable to hold the behavior we are wrapping

    public Shout(Behavior behavior){
        this.behavior = behavior; //a way to set the instance variable to the object we are wrapping
        //pass the behavior we are wrapping to the decorators constructor
    }

    public String getCelebration(){
        behavior.celebration = "SHOUT!";
        return behavior.celebration;
    }
}
