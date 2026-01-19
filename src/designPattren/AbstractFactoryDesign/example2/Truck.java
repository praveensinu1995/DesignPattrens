package designPattren.AbstractFactoryDesign.example2;

public class Truck implements Vehicle{
    @Override
    public void strat() {
        System.out.println("Start Truck engine");
    }

    @Override
    public void moive() {
        System.out.println("lets start Truck");
    }
}
