package exer_1.part_2;

public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected boolean has_fruit;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        // TODO: Implement.
        Tree other = (Tree)o;
        if (other.height > this.height)
            return -1;
        else if (other.height < this.height)
            return 1;
        else
            return 0;
    }

    // change the season of the current Tree
    public void changeSeason ()
    {
        int index = this.season.ordinal();
        int nextIndex = index + 1;
        nextIndex %= Season.values().length;
        this.season= Season.values()[nextIndex];
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor +
                '}';
    }
}
