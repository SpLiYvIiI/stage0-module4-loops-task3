package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int ans = 0;
        for(; firstBoarder <= secondBoarder; firstBoarder++){
            ans += firstBoarder;
        }
        System.out.println(ans);
    }
}
