public class Main {
    public static void main(String args[]){

        // RUN THE GAME IN THIS FILE
        for(int i = 0; i < 30; i++){
            System.out.println("RUN NUMBER: " + i);
            GameEngine e = new GameEngine();
            e.initializeRooms();
            e.initializeOrbiterObjects();
            e.initializeBlinkerObjects();
            e.initializeSeekerObjects();
            e.addAdv();
            e.runGame();
            System.out.println(" ");
        }
    }
}
