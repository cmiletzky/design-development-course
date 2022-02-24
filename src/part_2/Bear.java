package part_2;

public class Bear extends Animal {


    boolean is_sleeping;
    Bear(int weight, Season season) {
        // TODO: Implement.
        super(weight,season,Color.BROWN, "Bear");
        is_sleeping = get_sleeping();
    }
    @Override
    public String toString() {
        // TODO: Implement.

        return this.name + ". " + "My weight is: "
                + this.weight
                + " and my color is: "
                + this.color
                +"\n";

    }
    public boolean get_sleeping(){

        return season == Season.WINTER;
    }
    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
        is_sleeping = get_sleeping();
//
//        בחורף: הדוב יורד ב-20% ממשקלו. הדוב ישן בחורף
//        באביב: הדוב יורד ב-25% ממשקלו.
//                בקיץ: הדוב עולה בשליש ממשקלו.
//        בסתיו: הדוב עולה בכ25% ממשקלו.
//                הדב בצבע חום בכל עונות השנה.
        switch (this.getCurrentSeason()){
            case WINTER:
                this.weight = (int)(0.8 * this.weight);
                break;
            case SPRING:
                this.weight = (int)(0.75 * this.weight);
                break;
            case SUMMER:
                this.weight = (int)(((4/3) * this.weight));
                break;
            case FALL:
                this.weight = (int)(1.25 * this.weight);



        }

    }
}

