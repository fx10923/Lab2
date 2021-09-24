package vn.edu.design_pattern.factory_method.factory;

import vn.edu.design_pattern.factory_method.buttons.Button;
import vn.edu.design_pattern.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new HtmlButton();
	}
	
}
