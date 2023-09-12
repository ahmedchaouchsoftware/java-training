package designpatterns.abstract_factory.checkboxes;

public class WindowsOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox");
    }
}
