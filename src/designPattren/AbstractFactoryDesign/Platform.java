package designPattren.AbstractFactoryDesign;

public abstract class Platform {

    public void refreshAction() {
        System.out.println("refresh");
    }

    abstract UIComponentFactory createUiComponentFactory();
}
