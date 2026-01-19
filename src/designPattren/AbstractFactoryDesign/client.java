package designPattren.AbstractFactoryDesign;

public class client {
    public static void main(String[] args) {
        Platform platform=new Andriod();
        platform.createUiComponentFactory().createDropdown().dropDown();
        platform.createUiComponentFactory().createButton().click();
        Platform iosPlatform=new IOS();
        iosPlatform.createUiComponentFactory().createDropdown().dropDown();
        iosPlatform.createUiComponentFactory().createButton().click();
    }

}
