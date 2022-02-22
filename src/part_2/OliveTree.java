package part_2;

public class OliveTree extends Tree {



    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        // TODO: Implement.
        String gives_fruit= "";
        if (this.has_fruit)
            gives_fruit = "I give fruit. ";

        return "Olive tree."
                + gives_fruit
                + "My height is: "
                + this.height
                +" and my color is: "
                + Color.GREEN
                +"\n";
    }
    @Override
    public void changeSeason() {
        // TODO: Implement.
//        בחורף: גובהו של העץ עולה ב-5 ס"מ.
//        באביב: גובהו של העץ עולה ב-10 ס"מ.
//        בקיץ: גובהו של העץ עולה ב-10 ס"מ.
//        בסתיו: גובהו של העץ עולה ב-5 ס"מ והזית נותן פרי.

        super.changeSeason();
        switch (this.getCurrentSeason()){
            case WINTER :
                this.height = (int)(5 + this.height);
                this.has_fruit = false;
                break;
            case SPRING:
                this.height = (int)(10 + this.height);
                break;
            case SUMMER:
                this.height = (int)(10 + this.height);
                break;
            case FALL:
                this.height = (int)(5 + this.height);
                this.has_fruit = true;
                break;
        }
    }
}
