package part_2;

import part_1.C;

public class FigTree extends Tree {


    private boolean has_leaves;

    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
        this.leavesColor = color_by_season();
    }

    public Color color_by_season()
    {
        if (this.season == Season.WINTER || this.season == Season.FALL)
            return Color.YELLOW;
        else
            return  Color.GREEN;
    }

    @Override
    public String toString() {
        // TODO: Implement.
        String its_leaves = "and I have no leaves";
        if (has_leaves)
            its_leaves = " and my color is: "
                    + this.leavesColor;
        return "Fig tree. "
                +"My height is: "
                + this.height
                + " "+ its_leaves
                +"\n";
    }
    @Override
    public void changeSeason() {
        // TODO: Implement.

//        בחורף: גובהו של העץ עולה ב-20 ס"מ ואין על העץ עלים.
//        באביב: גובהו של העץ עולה ב-30 ס"מ צומחים עלים ירוקים .
//        בקיץ: גובהו של העץ עולה ב-30 ס"מ והתאנה נותנת פרי.
//        בסתיו: גובהו של העץ עולה ב-20 ס"מ צבע העלים הופך לצהוב.

        super.changeSeason();
        this.leavesColor = color_by_season();
        switch (this.getCurrentSeason()){
            case WINTER :
                this.height = (int)(20 + this.height);
                this.has_leaves = false;
                this.has_fruit = false;
                break;
            case SPRING:
                this.height = (int)(30 + this.height);
                this.has_fruit = false;
                break;
            case SUMMER:
                this.height = (int)(30 + this.height);
                this.has_fruit = true;
                break;
            case FALL:
                this.height = (int)(20 + this.height);
                this.has_fruit = false;
        }


    }
}
