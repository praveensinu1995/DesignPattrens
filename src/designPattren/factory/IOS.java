package designPattren.factory;

import designPattren.factory.components.button.Button;
import designPattren.factory.components.button.IosButton;

public class IOS extends Platform {

    @Override
    Button createButton() {
        return new IosButton();
    }
}
