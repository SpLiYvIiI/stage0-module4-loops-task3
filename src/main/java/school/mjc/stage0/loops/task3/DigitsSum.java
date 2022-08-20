package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int ans = 0;
        if(t < 0)
            t = -t;
        while (t > 0){
            ans += t % 10;
            t /= 10;
        }
        System.out.println(ans);
    }
}
