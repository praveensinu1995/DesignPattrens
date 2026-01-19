package designPattren.factory;

public class client {
    public static void main(String[] args) {
        Platform platform=new Andriod();
        platform.createButton().click();
        Platform iosPlatform=new IOS();
        iosPlatform.createButton().click();
    }

}
