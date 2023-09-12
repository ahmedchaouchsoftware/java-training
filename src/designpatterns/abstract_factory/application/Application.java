package designpatterns.abstract_factory.application;

import designpatterns.abstract_factory.buttons.Button;
import designpatterns.abstract_factory.checkboxes.CheckBox;
import designpatterns.abstract_factory.factories.GUIFactory;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
