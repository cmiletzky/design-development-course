//package part_2;
import java.lang.Comparable;

public abstract class Animal implements Seasonable,Comparable{


    protected int weight;
    protected Season season;
    protected Color color;
    protected String name;
    // TODO: Add auxiliary fields and functions.

    //getter for weight
    public int getWeight() {
        return weight;
    }
    // change the season of the current Animal
    public void changeSeason ()
    {
        int index = this.season.ordinal();
        int nextIndex = index + 1;
        nextIndex %= Season.values().length;
        this.season= Season.values()[nextIndex];
    }
    // constructor
    Animal(int weight, Season season, Color color, String name){
        this.weight =weight;
        this.season =season;
        this.color =color;
        this.name = name;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        // TODO: Implement.
        Animal other = (Animal)o;
        if (other.getWeight() > this.getWeight())
            return -1;
        else if (other.getWeight() == this.getWeight())
            return 0;
        else
            return 1;
    }
    @Override
    public String toString (){
        return "";
    }

}
