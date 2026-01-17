package designPattren.singletonDP;

public class client {
    public static void main(String[] args) {
        DBConnection instance = DBConnection.getInstance();
        DBConnection instance1 = DBConnection.getInstance();
        System.out.println(instance.equals(instance1));
    }
}
