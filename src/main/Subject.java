package main;

public abstract class Subject {

    private int size = 3;
    private int totalObservers = 0;
    private Observer[] observers = new Observer[size];


    public Subject() {

    }

    public Subject(int size) {
        this.size = size;
    }


    protected void attach(Observer o) {
        observers[totalObservers++] = o;
    }


    protected void notifyObservers() {
        for (int i = 0; i < totalObservers; i++) {
            observers[i].update();
        }
    }


    abstract public void setNumberA(int numberA);

    abstract public void setNumberB(int numberB);

    abstract public int getNumberA();

    abstract public int getNumberB();
}
