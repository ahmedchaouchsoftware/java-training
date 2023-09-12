package designpatterns.abstract_factory.buttons;

public class WindowsOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
