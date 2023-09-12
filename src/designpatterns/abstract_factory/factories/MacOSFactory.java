package designpatterns.abstract_factory.factories;

import designpatterns.abstract_factory.buttons.Button;
import designpatterns.abstract_factory.buttons.MacOSButton;
import designpatterns.abstract_factory.checkboxes.CheckBox;
import designpatterns.abstract_factory.checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
