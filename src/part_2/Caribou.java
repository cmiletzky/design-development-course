package part_2;

public class Caribou extends Animal {
    // 1= migrate to north, 0= migrate to south
    private boolean migrate;

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, null, "Caribou");
        this.color = color_by_season(season);

    }

    public Color color_by_season(Season season)
    {
        if (season == Season.WINTER)
            return Color.WHITE;
        else
            return Color.BROWN;
    }

    @Override
    public String toString() {
        // TODO: Implement.
        return this.name+ ": "
                + "My weight is: "
                + this.weight
                + " and my color is: "
                + this.color
                +"\n";
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
//        בחורף: הקריבו משנה את צבעו לצבע לבן ונודד דרומה.
//        באביב: הקריבו משנה את צבעו לצבע חום.
//        בקיץ: הקריבו נודד צפונה.
//                בסתיו: אין שינוי.
        switch (this.getCurrentSeason())
        {
            case WINTER :
                this.color = Color.WHITE;
                this.migrate = false;
                break;
            case SPRING:
                this.color = Color.BROWN;
                break;
            case SUMMER:
                this.migrate = true;
                break;
            case FALL:
                break;
        }





    }
}
