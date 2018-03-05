package kyu8;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[]{humanYears, humanYears==1?15 :humanYears==2 ? 24: 24+4*(humanYears-2)
                , humanYears==1?15 :humanYears==2 ? 24: 24+5*(humanYears-2)};
    }

}