package pl.sda.other;


public enum Continent {
    ASIA("Asia"), EUROPE("Europe"), AFRICA("Africa"), NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"), ANTARCTICA("Antarctica");

    private String name;

    private Continent(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
