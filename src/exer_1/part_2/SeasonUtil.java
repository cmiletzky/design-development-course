package exer_1.part_2;

import static java.util.Arrays.sort;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        // TODO: Implement.
        sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        // TODO: Implement.
        String all_elements = "";
        for (int i =0; i<seasonables.length; i++)
        {
            all_elements += seasonables[i];
        }
        return all_elements;
    }
}
