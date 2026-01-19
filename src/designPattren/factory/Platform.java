package designPattren.factory;

import designPattren.factory.components.button.Button;

public abstract class Platform {

    public void refreshAction(){
        System.out.println("refresh");
    }
    abstract Button createButton();
}
