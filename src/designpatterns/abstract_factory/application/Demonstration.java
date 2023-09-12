package designpatterns.abstract_factory.application;

import designpatterns.abstract_factory.factories.GUIFactory;
import designpatterns.abstract_factory.factories.MacOSFactory;
import designpatterns.abstract_factory.factories.WindowsOSFactory;

public class Demonstration {
    public static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsOSFactory();
        }
        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
