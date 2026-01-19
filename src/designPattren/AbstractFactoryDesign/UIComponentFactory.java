package designPattren.AbstractFactoryDesign;


import designPattren.AbstractFactoryDesign.components.button.Button;
import designPattren.AbstractFactoryDesign.components.dropdown.Dropdown;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
}
