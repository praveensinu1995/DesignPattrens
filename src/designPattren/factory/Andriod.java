package designPattren.factory;

import designPattren.factory.components.button.AndroidButton;
import designPattren.factory.components.button.Button;

public class Andriod extends Platform {
    @Override
    Button createButton() {
        return new AndroidButton();
    }
}
