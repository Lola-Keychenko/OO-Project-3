import java.util.Random;
import java.util.*;
import java.util.ArrayList;

public class GameEngine {

    //Arraylist Rooms, Creatures, Adventurers
    ArrayList<ArrayList<Room>> allRooms = new ArrayList<ArrayList<Room>>();
    ArrayList<Orbiter> Orbiters = new ArrayList<Orbiter>();
    ArrayList<Seeker> Seekers = new ArrayList<Seeker>();
    ArrayList<Blinker> Blinkers = new ArrayList<Blinker>();
    // Creating Adventurers
    ArrayList<Adventurer> adventureList = new ArrayList<Adventurer>();
    Brawler brawl = new Brawler();
    Sneaker sneak = new Sneaker();
    Runner run = new Runner();
    Thief th = new Thief();

    public void addAdv() {
        adventureList.add(brawl);
        adventureList.add(sneak);
        adventureList.add(run);
        adventureList.add(th);
    }


    //Method to Initalize rooms - the index of the arraylist of a floor is the floor number (allRooms.get(0) = arraylist of the zero floor)
    public void initializeRooms() {
        //appending lists of rooms(floors) to allRooms

        //zero floor
        ArrayList<Room> zeroFloor = new ArrayList<Room>();

        Room r011 = new Room(011); //entrance room, only connected to middle middle first floor
        zeroFloor.add(r011);

        allRooms.add(zeroFloor);

        //first floor
        ArrayList<Room> firstFloor = new ArrayList<Room>();

        Room r100 = new Room(100); //upper left
        firstFloor.add(r100);
        Room r101 = new Room(101); //upper middle
        firstFloor.add(r101);
        Room r102 = new Room(102); //upper right
        firstFloor.add(r102);
        Room r110 = new Room(110); //middle left
        firstFloor.add(r110);
        Room r111 = new Room(111); //middle middle
        firstFloor.add(r111);
        Room r112 = new Room(112); //middle right
        firstFloor.add(r112);
        Room r120 = new Room(120); //lower left
        firstFloor.add(r120);
        Room r121 = new Room(121); //lower middle
        firstFloor.add(r121);
        Room r122 = new Room(122); //lower right
        firstFloor.add(r122);

        allRooms.add(firstFloor);

        //second floor
        ArrayList<Room> secondFloor = new ArrayList<Room>();

        Room r200 = new Room(200); //upper left
        secondFloor.add(r200);
        Room r201 = new Room(201); //upper middle
        secondFloor.add(r201);
        Room r202 = new Room(202); //upper right
        secondFloor.add(r202);
        Room r210 = new Room(210); //middle left
        secondFloor.add(r210);
        Room r211 = new Room(211); //middle middle
        secondFloor.add(r211);
        Room r212 = new Room(212); //middle right
        secondFloor.add(r212);
        Room r220 = new Room(220); //lower left
        secondFloor.add(r220);
        Room r221 = new Room(221); //lower middle
        secondFloor.add(r221);
        Room r222 = new Room(222); //lower right
        secondFloor.add(r222);

        allRooms.add(secondFloor);

        //third floor
        ArrayList<Room> thirdFloor = new ArrayList<Room>();

        //Third Floor
        Room r300 = new Room(300); //upper left
        thirdFloor.add(r300);
        Room r301 = new Room(301); //upper middle
        thirdFloor.add(r301);
        Room r302 = new Room(302); //upper right
        thirdFloor.add(r302);
        Room r310 = new Room(310); //middle left
        thirdFloor.add(r310);
        Room r311 = new Room(311); //middle middle
        thirdFloor.add(r311);
        Room r312 = new Room(312); //middle right
        thirdFloor.add(r312);
        Room r320 = new Room(320); //lower left
        thirdFloor.add(r320);
        Room r321 = new Room(321); //lower middle
        thirdFloor.add(r321);
        Room r322 = new Room(322); //lower right
        thirdFloor.add(r322);

        allRooms.add(thirdFloor);

        //fourth floor
        ArrayList<Room> fourthFloor = new ArrayList<Room>();

        Room r400 = new Room(400); //upper left
        fourthFloor.add(r400);
        Room r401 = new Room(401); //upper middle
        fourthFloor.add(r401);
        Room r402 = new Room(402); //upper right
        fourthFloor.add(r402);
        Room r410 = new Room(410); //middle left
        fourthFloor.add(r410);
        Room r411 = new Room(411); //middle middle
        fourthFloor.add(r411);
        Room r412 = new Room(412); //middle right
        fourthFloor.add(r412);
        Room r420 = new Room(420); //lower left
        fourthFloor.add(r420);
        Room r421 = new Room(421); //lower middle
        fourthFloor.add(r421);
        Room r422 = new Room(422); //lower right
        fourthFloor.add(r422);

        allRooms.add(fourthFloor);

    }

    // ALL INITALIZATION OF CREATURES METHODS
    public Room findRoom(int room) {
        for (int i = 0; i < allRooms.get(room / 100).size(); i++) {
            if (room == allRooms.get(room / 100).get(i).getRoom()) {
                return allRooms.get(room / 100).get(i);
            }
        }
        return null;
    }

    // 4 Orbiters - start on an outer room on any of the four levels
    public int randomRoomOrbiter() {
        int room = 111;
        while (room == 111 || room == 211 || room == 311 || room == 411) {
            //generate random number between 1-4 for floor
            Random rand = new Random();
            int floor = rand.nextInt(4) + 1;
            //generate random number for row
            int row = rand.nextInt(3);
            //generate random number for col
            int col = rand.nextInt(3);
            //put generated numbers together to make a room number
            room = (floor * 100) + (row * 10) + (col);
        }
        return room;
    }

    // THE ARRAY OF ORBITERS IS A GOOD EXAMPLE OF IDENTITY
    // EACH ORBITER HAS ITS IDENTITY KNOWN FROM ITS NAME
    // SAME GOES FOR OTHER CREATURES AND ADVENTURERS
    public void initializeOrbiterObjects() {
        int num = randomRoomOrbiter();
        Room randRoom = findRoom(num);
        Orbiter orbiter1 = new Orbiter(randRoom);

        num = randomRoomOrbiter();
        randRoom = findRoom(num);
        Orbiter orbiter2 = new Orbiter(randRoom);

        num = randomRoomOrbiter();
        randRoom = findRoom(num);
        Orbiter orbiter3 = new Orbiter(randRoom);

        num = randomRoomOrbiter();
        randRoom = findRoom(num);
        Orbiter orbiter4 = new Orbiter(randRoom);

        // Adding all Orbiters to Arraylist
        Orbiters.add(orbiter1);
        Orbiters.add(orbiter2);
        Orbiters.add(orbiter3);
        Orbiters.add(orbiter4);
    }

    // 4 Seekers - start on any random room in four levels
    public int randomRoomSeeker() {
        //generate random number between 1-4 for floor
        Random rand = new Random();
        int floor = rand.nextInt(4) +  1;
        //generate random number for row
        int row = rand.nextInt(2);
        //generate random number for col
        int col = rand.nextInt(2);
        //put generated numbers together to make a room number
        int room = (floor * 100) + (row * 10) + (col);
        return room;
    }

    public void initializeSeekerObjects() {
        int num = randomRoomSeeker();
        Room randRoom = findRoom(num);
        Seeker seeker1 = new Seeker(randRoom);

        num = randomRoomSeeker();
        randRoom = findRoom(num);
        Seeker seeker2 = new Seeker(randRoom);

        num = randomRoomSeeker();
        randRoom = findRoom(num);
        Seeker seeker3 = new Seeker(randRoom);

        num = randomRoomSeeker();
        randRoom = findRoom(num);
        Seeker seeker4 = new Seeker(randRoom);

        // Adding all Orbiters to Arraylist
        Seekers.add(seeker1);
        Seekers.add(seeker2);
        Seekers.add(seeker3);
        Seekers.add(seeker4);
    }

    // 4 Blinkers - start in random room on level four
    public int randomRoomBlinker() {
        //generate random number between 1-4 for floor
        Random rand = new Random();
        int floor = 4;
        //generate random number for row
        int row = rand.nextInt(3);
        //generate random number for col
        int col = rand.nextInt(3);
        //put generated numbers together to make a room number
        int room = (floor * 100) + (row * 10) + (col);
        return room;
    }

    public void initializeBlinkerObjects() {
        int num = randomRoomBlinker();
        Room randRoom = findRoom(num);
        Blinker blinker1 = new Blinker(randRoom);

        num = randomRoomBlinker();
        randRoom = findRoom(num);
        Blinker blinker2 = new Blinker(randRoom);

        num = randomRoomBlinker();
        randRoom = findRoom(num);
        Blinker blinker3 = new Blinker(randRoom);

        num = randomRoomBlinker();
        randRoom = findRoom(num);
        Blinker blinker4 = new Blinker(randRoom);

        // Adding all Orbiters to Arraylist
        Blinkers.add(blinker1);
        Blinkers.add(blinker2);
        Blinkers.add(blinker3);
        Blinkers.add(blinker4);
    }


    public void runGame() {
        // Set all adventurers
        Room startingRoom = new Room(111);
        startingRoom.setRoom(111);
        startingRoom.setHasBrawler(true);
        startingRoom.setHasSneaker(true);
        startingRoom.setHasRunner(true);
        startingRoom.setHasThief(true);
        brawl.setMyRoom(startingRoom);
        sneak.setMyRoom(startingRoom);
        run.setMyRoom(startingRoom);
        th.setMyRoom(startingRoom);
        // These will determine when to end the game, conditions checked at end of while loop
        boolean game = true;


        int creaturesEliminated = 0;
        int adventurersEliminated = 0;
        while (game) {
            // Run through turns while end conditions are not met
            // FIRST DISPLAY BOARD
            //printGame();
            int totalTreasure = 0;
            // Then move each adventurer
            for (int i = 0; i < adventureList.size(); i++) {
                // Move each adventurer
                // Get the adventurer, find the room the adventurer is in
                Adventurer a = adventureList.get(i);
                Room r = a.getMyRoom();
                int roomNum = r.getRoom();
                // Take note of what type of creature is in the room
                int adventurerType;
                if(r.isHasRunner()){
                    adventurerType = 1;
                }else if(r.isHasBrawler()){
                    adventurerType = 2;
                }else if(r.isHasSneaker()){
                    adventurerType = 3;
                }else{
                    adventurerType = 4;
                }
                // Move adventurer to new room, then update new/old room with content based on creature type
                int newRoomNum = a.setNewRoom(roomNum);
                Room r1 = new Room(newRoomNum);
                a.setMyRoom(r1);
                //Room r1 = a.getMyRoom();
                if(adventurerType == 1){
                    r1.setHasRunner(true);
                    r.setHasRunner(false);
                }else if(adventurerType == 2){
                    r1.setHasBrawler(true);
                    r.setHasBrawler(false);
                }else if(adventurerType == 3){
                    r1.setHasSneaker(true);
                    r.setHasSneaker(false);
                }else{
                    r1.setHasThief(true);
                    r.setHasThief(false);
                }

                // Now check the new room for creatures
                boolean isCreature = CreatureCheck(r1);
                if(isCreature){
                    // First figure out what kind of creature is in the room
                    int creatureType;
                    if(r1.isHasBlinker()){
                        creatureType = 1;
                    }else if(r1.isHasSeeker()){
                        creatureType = 2;
                    }else{
                        creatureType = 3; // Orbiter is type 3
                    }
                    int fightResult = fight(r1);
                    if(fightResult == 1){
                        // If the adventurer wins, eliminate the creature
                        if(creatureType == 1) {
                            r1.setHasBlinker(false);
                            creaturesEliminated++;
                            if(Blinkers.size() > 0) {
                                Blinkers.remove(Blinkers.get(0));
                            }
                        }else if(creatureType == 2){
                            r1.setHasSeeker(false);
                            creaturesEliminated++;
                            if(Seekers.size()>0){
                                Seekers.remove(Seekers.get(0));
                            }

                        }else{
                            r1.setHasOrbiter(false);
                            creaturesEliminated++;
                            if(Orbiters.size()>0){
                                Orbiters.remove(Orbiters.get(0));
                            }

                        }
                    }else if(fightResult == 2){
                        // If the creature wins, add one to the adventurer's damage
                        a.setDamage(a.getDamage() + 1);
                    }
                    // Do nothing if tie
                }else {
                    // Search for treasure
                    boolean isTreasure = a.isTreasure();
                    if (isTreasure) {
                        if (adventurerType == 4) {
                            // If the adventurer is a Thief
                            a.setTreasure(a.getTreasure() + 2);
                        } else {
                            a.setTreasure(a.getTreasure() + 1);
                        }
                    }
                }
            } // For loop of adventurers EXIT

            // Creatures Move
            for(int j = 0; j < Orbiters.size(); j++){
                Orbiter o = Orbiters.get(j);
                o.Move(allRooms);
            }
            for(int j = 0; j < Seekers.size(); j++){
                Seeker s = Seekers.get(j);
                s.Move(allRooms);
            }
            for(int j = 0; j < Blinkers.size(); j++){
                Blinker b = Blinkers.get(j);
                b.Move(allRooms);
            }
            // Check for adventurer deaths,  get total treasure
            for (int i = 0; i < adventureList.size(); i++) {
                Adventurer a = adventureList.get(i);
                totalTreasure += a.getTreasure();
                Room r = a.getMyRoom();
                boolean dead = false;
                if(a.getDamage() == 3){
                    dead = true;
                }
                if (r.isHasRunner()) {
                    // If the damage is 3, remove the runner from the game
                    if(dead){
                        r.setHasRunner(false);
                    }
                } else if (r.isHasBrawler()) {
                    if(dead){
                        r.setHasBrawler(false);
                    }
                } else if (r.isHasSneaker()) {
                    if(dead){
                        r.setHasSneaker(false);
                    }
                } else {
                    if(dead){
                        r.setHasThief(false);
                    }
                }
            }
            // Check for Win/Loss

            if(totalTreasure >= 10 || creaturesEliminated == 12){
                for(int j = 0; j < adventureList.size(); j++){
                    if(adventureList.get(j).getDamage() >= 3){
                      adventurersEliminated++;
                    }
                }
                System.out.printf("Total Treasure found:");
                System.out.println(totalTreasure);
                System.out.printf("Total creatures eliminated: ", creaturesEliminated);
                System.out.println(creaturesEliminated);
                System.out.printf("Total adventurers eliminated: ", adventurersEliminated);
                System.out.println(adventurersEliminated);
                game = false;
            }
        }
    }

    // Helper methods for the game engine include: CreatureCheck, Fight, etc.
    // Returns true if the room has a creature
    public boolean CreatureCheck(Room myAdvRoom) {
        // If there is a creature in the room I am in, return true
        if (myAdvRoom.isHasOrbiter() || myAdvRoom.isHasBlinker() || myAdvRoom.isHasSneaker()) {
            return true;
        } else {
            return false;
        }
    }

    // Method for all fights
    // return 1 if adventurer win
    // return 2 if creature win
    // return 3 if tie
    public int fight(Room r) {
        // Rolls for creature and adventurer are taken at the beginning
        Random rand = new Random();
        int aRand1 = rand.nextInt(6) + 1;
        int aRand2 = rand.nextInt(6) + 1;
        int cRand1 = rand.nextInt(6) + 1;
        int cRand2 = rand.nextInt(6) + 1;
        int aRoll = aRand1 + aRand2;
        int cRoll = cRand1 + cRand2;
        if (r.isHasBrawler()) {
            // Brawler fight
            Brawler b = new Brawler();
            int finalScore = b.Special(aRoll);
            if (finalScore > cRoll) {  // Adventurer win
                return 1;
            } else if (cRoll > finalScore) { // Creature win
                return 2;
            } else { // Tie
                return 3;
            }
        } else if (r.isHasSneaker()) {
            // Sneaker fight
            Sneaker s = new Sneaker();
            if (s.Special()) {
                if (aRoll > cRoll) {
                    return 1;
                } else if (cRoll > aRoll) {
                    return 2;
                } else {
                    return 3;
                }
            }

        } else if (r.isHasRunner()) {
            // Runner fight
            if (aRoll > cRoll) {
                return 1;
            } else if (cRoll > aRoll) {
                return 2;
            } else {
                return 3;
            }
        } else {
            // Thief fight
            Thief t = new Thief();
            int newTScore = t.fightSpecial(aRoll);
            if (newTScore > cRoll) {
                return 1;
            } else if (cRoll > newTScore) {
                return 2;
            } else {
                return 3;
            }
        }
        return 0;
    }

    public void printGame() {
        //print all of the Adventurers
        System.out.println("Brawler - "+brawl.getTreasure()+" Treasures - "+brawl.getDamage()+" Damage");
        System.out.println("Sneaker - "+sneak.getTreasure()+" Treasures - "+sneak.getDamage()+" Damage");
        System.out.println("Runner - "+run.getTreasure()+" Treasures - "+run.getDamage()+" Damage");
        System.out.println("Thief - "+th.getTreasure()+" Treasures - "+th.getDamage()+" Damage");

        //print all of the creatures
        System.out.println("Orbiters - "+Orbiters.size()+" Remaining");
        System.out.println("Seekers - "+Seekers.size()+" Remaining");
        System.out.println("Blinkers - "+Blinkers.size()+" Remaining");


        //print the rooms, if there is something in the room print that too
        System.out.println("RotLAL: ");
        //for every floor in rooms array
        String roomNum = "";
        for(int floor = 1; floor < 5; floor++){
            //for each room
            for(int room = 0; room < 9; room++){
                Room currentRoom = allRooms.get(floor).get(room);
                //create string which is room number
                roomNum = Integer.toString(currentRoom.getRoom()) + " ";
                //if there is a brawler
                if(currentRoom.isHasBrawler()){
                    roomNum+=": B ";
                }
                if(currentRoom.isHasSneaker()){
                    roomNum+=": SN";
                }
                if(currentRoom.isHasRunner()){
                    roomNum+=": RN";
                }
                if(currentRoom.isHasThief()){
                    roomNum+=": TH";
                }

                if(currentRoom.isHasSeeker()){
                    roomNum+=": SE";
                }
                if(currentRoom.isHasBlinker()){
                    roomNum+=": BL";
                }
                if(currentRoom.isHasOrbiter()){
                    roomNum+=": OR";
                }


                //if there is a treasure
                System.out.print(roomNum+ " ");
            }

            System.out.println(" ");
        }


    }
}