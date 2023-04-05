package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        int num = 0;
        int value = 1;
        while (num <= power) {
            System.out.println(value);
            num++;
            value *= 2;
        }
    }
}
