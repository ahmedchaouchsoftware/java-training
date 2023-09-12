package designpatterns.abstract_factory.factories;

import designpatterns.abstract_factory.buttons.Button;
import designpatterns.abstract_factory.buttons.MacOSButton;
import designpatterns.abstract_factory.buttons.WindowsOSButton;
import designpatterns.abstract_factory.checkboxes.CheckBox;
import designpatterns.abstract_factory.checkboxes.MacOSCheckBox;
import designpatterns.abstract_factory.checkboxes.WindowsOSCheckBox;

public class WindowsOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsOSCheckBox();
    }
}
