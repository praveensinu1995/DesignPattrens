package multiThreading;

public class Value {
    private volatile   int x;
    public Value(int x){
        this.x=x;
    }

    public synchronized int getX() {
        return x;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }
    public synchronized void incrementX(int num){
        this.x=x+num;
    }
}
