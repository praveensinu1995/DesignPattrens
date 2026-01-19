package designPattren.factory.components.button;

public class IosButton implements Button{

    @Override
    public void click() {
        System.out.println("IOS button");
    }
}
