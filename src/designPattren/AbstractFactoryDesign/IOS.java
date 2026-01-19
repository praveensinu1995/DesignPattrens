package designPattren.AbstractFactoryDesign;

import designPattren.AbstractFactoryDesign.components.button.Button;
import designPattren.AbstractFactoryDesign.components.button.IosButton;

public class IOS extends Platform {


    @Override
    UIComponentFactory createUiComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
