public class Untrained implements CombatBehavior{
    //Untrained - no bonus to 2 dice roll for fighting a creature
    public int fight(Room r){
        return 1;
    }
}