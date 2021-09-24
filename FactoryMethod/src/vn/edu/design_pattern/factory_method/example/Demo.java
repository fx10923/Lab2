package vn.edu.design_pattern.factory_method.example;

import vn.edu.design_pattern.factory_method.factory.Dialog;
import vn.edu.design_pattern.factory_method.factory.HtmlDialog;
import vn.edu.design_pattern.factory_method.factory.MacOSDialog;

public class Demo {
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
        runBusinessLogic();
	}
	
	/**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            dialog = new MacOSDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
