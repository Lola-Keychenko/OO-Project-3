public class Treasure {
    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

// Rooms class will have an arraylist of treasures it holds
// Adventurers will have an arraylist of treasures they hold
// when treasure is found, we remove from rooms arraylist and add to adventurers
// Adv can only hold one of each treasure, will need to check before picking it up
