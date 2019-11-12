package main;

public abstract class Observer {

    protected Subject subject;

    protected Observer(Subject subject) {
        this.subject = subject;
    }

    /**
     * Calls any implementations to update from their subject.
     */
    abstract void update();
}
