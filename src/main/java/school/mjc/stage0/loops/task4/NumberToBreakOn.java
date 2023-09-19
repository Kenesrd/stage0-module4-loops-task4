package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil){
            System.out.println("iterating till the end");
            iterator(numberToGoUntil, numberToGoUntil);
            return;
        }
        iterator(toBreakWith, numberToGoUntil);
    }

    private void iterator(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i <= numberToGoUntil; i++){
            System.out.println(i);
            if (i == toBreakWith){
                break;
            }

        }
    }

    public static void main(String[] args) {
        NumberToBreakOn n = new NumberToBreakOn();
        n.printNumbersUntilWithBreakOn(5, 10);
    }
}
