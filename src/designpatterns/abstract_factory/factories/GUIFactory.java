package designpatterns.abstract_factory.factories;

import designpatterns.abstract_factory.buttons.Button;
import designpatterns.abstract_factory.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
