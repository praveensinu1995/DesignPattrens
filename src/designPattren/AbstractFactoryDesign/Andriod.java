package designPattren.AbstractFactoryDesign;

import designPattren.AbstractFactoryDesign.components.button.AndroidButton;
import designPattren.AbstractFactoryDesign.components.button.Button;

public class Andriod extends Platform {

    @Override
    UIComponentFactory createUiComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
