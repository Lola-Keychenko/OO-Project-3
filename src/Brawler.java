public class Brawler extends Adventurer {
    //Brawlers get +2 to dice rolls when fighting a creature
    public int Special(int currentScore){
        return currentScore+2;
    }

}
