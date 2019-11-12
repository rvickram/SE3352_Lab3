package main;

public class NumberSubject extends Subject {
    private int numberA = 0;
    private int numberB = 1;

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }
}
