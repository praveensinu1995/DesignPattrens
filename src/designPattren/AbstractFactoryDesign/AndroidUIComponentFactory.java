package designPattren.AbstractFactoryDesign;

import designPattren.AbstractFactoryDesign.components.button.AndroidButton;
import designPattren.AbstractFactoryDesign.components.button.Button;
import designPattren.AbstractFactoryDesign.components.dropdown.AndroidDropdown;
import designPattren.AbstractFactoryDesign.components.dropdown.Dropdown;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
