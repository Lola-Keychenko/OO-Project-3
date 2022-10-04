public abstract class Behavior {
    protected String celebration = "Unknown Celebration";
    public abstract int fight(Room r);
    public String getCelebration(){
        return celebration;
    }
}
