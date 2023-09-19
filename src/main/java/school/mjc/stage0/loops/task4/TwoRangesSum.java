package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow){
            System.out.println("number to skip is bigger then the last");
            return;
        } else if (lastInRow < 0){
            System.out.println("last number in row is negative");
            return;
        }

        int numToSkip = printedSum(1, numberToSkip);
        int sum = printedSum(numberToSkip + 1, lastInRow);
        System.out.println("skipped sum is "+numToSkip);
        System.out.println("counted sum is "+sum);
    }

    private int printedSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++){
            sum += i;
        }
        return sum;
    }
}
