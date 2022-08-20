package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = Math.min(first,second);
        int max = Math.max(first,second);
        int ans = -1;
        for(int i = 1; i <= min; i++)
            if(first % i == 0 && second % i == 0)
                ans = i;
        if(first == 0 || second == 0)
            System.out.println(max);
        else
            System.out.println(ans);
    }
}
