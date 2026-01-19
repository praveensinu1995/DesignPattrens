package designPattren.AbstractFactoryDesign;

import designPattren.AbstractFactoryDesign.components.button.Button;
import designPattren.AbstractFactoryDesign.components.button.IosButton;
import designPattren.AbstractFactoryDesign.components.dropdown.Dropdown;
import designPattren.AbstractFactoryDesign.components.dropdown.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
