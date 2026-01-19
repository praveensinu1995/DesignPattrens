package designPattren.AbstractFactoryDesign.example2;

public class Ship implements Vehicle{
    @Override
    public void strat() {
        System.out.println("Start Ship engine");
    }

    @Override
    public void moive() {
        System.out.println("lets Ship Truck");
    }
}
