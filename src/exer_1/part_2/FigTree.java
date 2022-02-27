package exer_1.part_2;

public class FigTree extends Tree {


    private boolean has_leaves;

    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
        has_leaves = get_leaves();
        has_fruit = get_fruit();
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
        String its_leaves = has_leaves ? " and my color is: " + this.leavesColor : " and I have no leaves",
                fruit = has_fruit ? "I give fruit. " : "";
        return "Fig tree. " + fruit
                +"My height is: "
                + this.height
                + its_leaves
                +"\n";
    }
    public boolean get_fruit(){
        return season == Season.SUMMER;
    }
    public boolean get_leaves(){
        return  season != Season.WINTER;
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
        has_fruit = get_fruit();
        has_leaves = get_leaves();
        switch (this.getCurrentSeason()){
            case WINTER :
                this.height +=20;
                break;
            case SPRING:
                this.height +=30;
                break;
            case SUMMER:
                this.height += 30;
                break;
            case FALL:
                this.height += 20 ;
        }


    }
}
