import java.util.Random;
import java.util.*;
import java.util.ArrayList;

public class GameEngine extends Subject{

    //Arraylist Rooms, Creatures, Adventurers
    ArrayList<ArrayList<Room>> allRooms = new ArrayList<ArrayList<Room>>();
    ArrayList<Orbiter> Orbiters = new ArrayList<Orbiter>();
    ArrayList<Seeker> Seekers = new ArrayList<Seeker>();
    ArrayList<Blinker> Blinkers = new ArrayList<Blinker>();

    // create arraylist of adventurers and assign their combat/search behaviors
    ArrayList<Adventurer> adventureList = new ArrayList<Adventurer>();

    // THIS IS AN EXAMPLE OF THE STRATEGY PATTERN - SEE IMPLEMENTATIONS FOR MORE DETAILS

    Behavior train = new Trained();
    Behavior untrain = new Untrained();
    Behavior stealth = new Stealth();
    Behavior expert = new Expert();
    SearchBehavior careful = new Careful();
    SearchBehavior quick = new Quick();
    SearchBehavior careless = new Careless();

    Brawler brawl = new Brawler(expert, careless);
    Sneaker sneak = new Sneaker(stealth, quick);
    Runner run = new Runner(untrain, quick);
    Thief th = new Thief(train, careful);

    //GETTERS


    public ArrayList<Adventurer> getAdventureList() {
        return adventureList;
    }

    public void addAdv() {
        adventureList.add(brawl);
        adventureList.add(sneak);
        adventureList.add(run);
        adventureList.add(th);
    }

    //METHODS TO INITALIZE TREASURES
    //24 Treasure objects will now be randomly placed in Rooms at the start of the simulation (4 of each of 6 subtypes)
    public void makeTreasures(){
        //create 4 of each of type of treasure
        Sword s1 = new Sword();
        Room myRoom = findRoomForTreasure();
        myRoom.treasures.add(s1);

        Sword s2 = new Sword();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(s2);

        Sword s3 = new Sword();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(s3);

        Sword s4 = new Sword();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(s4);

        Gem g1 = new Gem();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(g1);

        Gem g2 = new Gem();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(g2);

        Gem g3 = new Gem();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(g3);

        Gem g4 = new Gem();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(g4);

        Armor a1 = new Armor();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(a1);

        Armor a2 = new Armor();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(a2);

        Armor a3 = new Armor();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(a3);

        Armor a4 = new Armor();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(a4);

        Portal p1 = new Portal();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(p1);

        Portal p2 = new Portal();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(p2);

        Portal p3 = new Portal();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(p3);

        Portal p4 = new Portal();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(p4);

        Trap t1 = new Trap();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(t1);

        Trap t2 = new Trap();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(t2);

        Trap t3 = new Trap();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(t3);

        Trap t4 = new Trap();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(t4);

        Potion pot1 = new Potion();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(pot1);

        Potion pot2 = new Potion();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(pot2);

        Potion pot3 = new Potion();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(pot3);

        Potion pot4 = new Potion();
        myRoom = findRoomForTreasure();
        myRoom.treasures.add(pot4);
    }

    //METHOD TO PLACE TREASURES
    public Room findRoomForTreasure(){
        // Generate random num 1 - 4 for index of floor
        Random rand = new Random();
        int floor = rand.nextInt(5) + 1;
        // Generate random num 0 - 8 for index of room
        int room = rand.nextInt(9);
        return allRooms.get(floor).get(room);
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

        System.out.println("Starting to run game");

        int creaturesEliminated = 0;
        int adventurersEliminated = 0;
        int totalTreasure = 0;

        while (game) {
            // Run through turns while end conditions are not met
            // FIRST DISPLAY BOARD
            // printGame();
            // Move each adventurer one by one
            Logger myLog = new Logger("1");

            // START WITH RUNNER
            if(adventureList.contains(run)){ // if the adventurer is still alive, move it
                Room runRoom = run.getMyRoom();
                int runRoomNum = runRoom.getRoom();
                int newRunRoomNum = run.setNewRoom(runRoomNum);
                Room runRoom1 = new Room(newRunRoomNum);
                run.setMyRoom(runRoom1);
                runRoom1.setHasRunner(true);
                runRoom.setHasRunner(false);

                boolean runIsCreature = CreatureCheck(runRoom1);
                if(runIsCreature){
                    int runCreatureType;
                    if(runRoom1.isHasBlinker()){
                        runCreatureType = 1;
                    }else if(runRoom1.isHasSeeker()){
                        runCreatureType = 2;
                    }else{
                        runCreatureType = 3; // Orbiter is type 3
                    }
                    int runFight = run.executeStrategy(runRoom1);
                    if(runFight == 1){
                        // If the adventurer wins, eliminate the creature
                        if(runCreatureType == 1) {
                            runRoom1.setHasBlinker(false);
                            creaturesEliminated++;
                            if(Blinkers.size() > 0) {
                                Blinkers.remove(Blinkers.get(0));
                            }
                        }else if(runCreatureType == 2){
                            runRoom1.setHasSeeker(false);
                            creaturesEliminated++;
                            if(Seekers.size()>0){
                                Seekers.remove(Seekers.get(0));
                            }

                        }else{
                            runRoom1.setHasOrbiter(false);
                            creaturesEliminated++;
                            if(Orbiters.size()>0){
                                Orbiters.remove(Orbiters.get(0));
                            }
                        }
                    }else if(runFight == 2){
                        // If the creature wins, add one to the adventurer's damage
                        run.setDamage(run.getDamage() + 1);
                    }
                    // Search for Treasure
                    if(runRoom1.treasures != null){
                        // If there is a treasure in the room, search and see if it can be picked up
                        boolean isTreasure = run.executeSearchStrategy(runRoom1);
                        if(isTreasure){
                            // If the search is successful, see which treasure can be picked up
                            run.compareTreasures(runRoom1.treasures);
                        }
                    }

                }
            }

            // BRAWLER MOVES

            if(adventureList.contains(brawl)){ // if the adventurer is still alive, move it
                Room brawlRoom = brawl.getMyRoom();
                int brawlRoomNum = brawlRoom.getRoom();
                int newBrawlRoomNum = brawl.setNewRoom(brawlRoomNum);
                Room brawlRoom1 = new Room(newBrawlRoomNum);
                brawl.setMyRoom(brawlRoom1);
                brawlRoom1.setHasRunner(true);
                brawlRoom1.setHasRunner(false);

                // If there is a creature inside the room, the two will fight
                boolean brawlIsCreature = CreatureCheck(brawlRoom1);
                if(brawlIsCreature){
                    // Take note of what kind of creature is present in the room
                    int brawlCreatureType;
                    if(brawlRoom1.isHasBlinker()){
                        brawlCreatureType = 1;
                    }else if(brawlRoom1.isHasSeeker()){
                        brawlCreatureType = 2;
                    }else{
                        brawlCreatureType = 3; // Orbiter is type 3
                    }
                    // Brawler fights creature, int returned describes who won
                    int brawlFight = brawl.executeStrategy(brawlRoom1);
                    if(brawlFight == 1){
                        // If the adventurer wins, eliminate the creature
                        if(brawlCreatureType == 1) {
                            brawlRoom1.setHasBlinker(false);
                            creaturesEliminated++;
                            if(Blinkers.size() > 0) {
                                Blinkers.remove(Blinkers.get(0));
                            }
                        }else if(brawlCreatureType == 2){
                            brawlRoom1.setHasSeeker(false);
                            creaturesEliminated++;
                            if(Seekers.size()>0){
                                Seekers.remove(Seekers.get(0));
                            }

                        }else{
                            brawlRoom1.setHasOrbiter(false);
                            creaturesEliminated++;
                            if(Orbiters.size()>0){
                                Orbiters.remove(Orbiters.get(0));
                            }
                        }
                    }else if(brawlFight == 2){
                        // If the creature wins, add one to the adventurer's damage
                        brawl.setDamage(brawl.getDamage() + 1);
                    }
                    // Search for Treasure
                }
            }

            // SNEAKER MOVES

            if(adventureList.contains(sneak)){ // if the adventurer is still alive, move it
                Room sneakRoom = sneak.getMyRoom();
                int sneakRoomNum = sneakRoom.getRoom();
                int newsneakRoomNum = sneak.setNewRoom(sneakRoomNum);
                Room sneakRoom1 = new Room(newsneakRoomNum);
                sneak.setMyRoom(sneakRoom1);
                sneakRoom1.setHasRunner(true);
                sneakRoom1.setHasRunner(false);

                // If there is a creature inside the room, the two will fight
                boolean sneakIsCreature = CreatureCheck(sneakRoom1);
                if(sneakIsCreature){
                    // Take note of what kind of creature is present in the room
                    int sneakCreatureType;
                    if(sneakRoom1.isHasBlinker()){
                        sneakCreatureType = 1;
                    }else if(sneakRoom1.isHasSeeker()){
                        sneakCreatureType = 2;
                    }else{
                        sneakCreatureType = 3; // Orbiter is type 3
                    }
                    // Brawler fights creature, int returned describes who won
                    int sneakFight = sneak.executeStrategy(sneakRoom1);
                    if(sneakFight == 1){
                        // If the adventurer wins, eliminate the creature
                        if(sneakCreatureType == 1) {
                            sneakRoom1.setHasBlinker(false);
                            creaturesEliminated++;
                            if(Blinkers.size() > 0) {
                                Blinkers.remove(Blinkers.get(0));
                            }
                        }else if(sneakCreatureType == 2){
                            sneakRoom1.setHasSeeker(false);
                            creaturesEliminated++;
                            if(Seekers.size()>0){
                                Seekers.remove(Seekers.get(0));
                            }

                        }else{
                            sneakRoom1.setHasOrbiter(false);
                            creaturesEliminated++;
                            if(Orbiters.size()>0){
                                Orbiters.remove(Orbiters.get(0));
                            }
                        }
                    }else if(sneakFight == 2){
                        // If the creature wins, add one to the adventurer's damage
                        sneak.setDamage(sneak.getDamage() + 1);
                    }
                    // Search for Treasure
                }
            }

            // THIEF MOVES

            if(adventureList.contains(th)){ // if the adventurer is still alive, move it
                Room thRoom = th.getMyRoom();
                int thRoomNum = thRoom.getRoom();
                int newthRoomNum = th.setNewRoom(thRoomNum);
                Room thRoom1 = new Room(newthRoomNum);
                th.setMyRoom(thRoom1);
                thRoom1.setHasRunner(true);
                thRoom1.setHasRunner(false);

                // If there is a creature inside the room, the two will fight
                boolean thIsCreature = CreatureCheck(thRoom1);
                if(thIsCreature){
                    // Take note of what kind of creature is present in the room
                    int thCreatureType;
                    if(thRoom1.isHasBlinker()){
                        thCreatureType = 1;
                    }else if(thRoom1.isHasSeeker()){
                        thCreatureType = 2;
                    }else{
                        thCreatureType = 3; // Orbiter is type 3
                    }
                    // Brawler fights creature, int returned describes who won
                    int thFight = th.executeStrategy(thRoom1);
                    if(thFight == 1){
                        // If the adventurer wins, eliminate the creature
                        if(thCreatureType == 1) {
                            thRoom1.setHasBlinker(false);
                            creaturesEliminated++;
                            if(Blinkers.size() > 0) {
                                Blinkers.remove(Blinkers.get(0));
                            }
                        }else if(thCreatureType == 2){
                            thRoom1.setHasSeeker(false);
                            creaturesEliminated++;
                            if(Seekers.size()>0){
                                Seekers.remove(Seekers.get(0));
                            }

                        }else{
                            thRoom1.setHasOrbiter(false);
                            creaturesEliminated++;
                            if(Orbiters.size()>0){
                                Orbiters.remove(Orbiters.get(0));
                            }
                        }
                    }else if(thFight == 2){
                        // If the creature wins, add one to the adventurer's damage
                        th.setDamage(th.getDamage() + 1);
                    }
                    // Search for Treasure
                }
            }


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


    public void printGame() {
        /*//print all of the Adventurers
        System.out.printf("Brawler - ");
        brawl.getTreasure();
        System.out.printf(" Treasures - ", brawl.getDamage(), " Damage");
        System.out.println(" ");
        System.out.printf("Sneaker - ");
        sneak.getTreasure();
        System.out.printf(" Treasures - ", sneak.getDamage(), " Damage");
        System.out.println(" ");
        System.out.printf("Thief - ");
        th.getTreasure();
        System.out.printf(" Treasures - ", th.getDamage(), " Damage");
        System.out.println(" ");
        System.out.printf("Runner - ");
        run.getTreasure();
        System.out.printf(" Treasures - ", run.getDamage(), " Damage");
        System.out.println(" ");

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
        }*/


    }
}