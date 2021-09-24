package vn.edu.design_pattern.factory_method.factory;

import vn.edu.design_pattern.factory_method.buttons.Button;
import vn.edu.design_pattern.factory_method.buttons.MacOSButton;

public class MacOSDialog extends Dialog {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

}
