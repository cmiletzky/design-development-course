package part_2;

public class OliveTree extends Tree {



    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,Color.GREEN);
        has_fruit = get_fruit();
    }

    @Override
    public String toString() {
        // TODO: Implement.
        String gives_fruit= "";
        if (this.has_fruit)
            gives_fruit = "I give fruit. ";

        return "Olive tree. "
                + gives_fruit
                + "My height is: "
                + this.height
                +" and my color is: "
                + Color.GREEN
                +"\n";
    }
    public boolean get_fruit(){
        return season == Season.FALL;
    }
    @Override
    public void changeSeason() {
        // TODO: Implement.
//        בחורף: גובהו של העץ עולה ב-5 ס"מ.
//        באביב: גובהו של העץ עולה ב-10 ס"מ.
//        בקיץ: גובהו של העץ עולה ב-10 ס"מ.
//        בסתיו: גובהו של העץ עולה ב-5 ס"מ והזית נותן פרי.

        super.changeSeason();
        has_fruit = get_fruit();
        switch (this.getCurrentSeason()){
            case WINTER :
                this.height +=5;
                break;
            case SPRING:
                this.height += 10;
                break;
            case SUMMER:
                this.height += 10;
                break;
            case FALL:
                this.height += 5;
                break;
        }
    }
}
