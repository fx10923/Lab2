package vn.edu.bridge_pattern.example;

import vn.edu.bridge_pattern.devices.Device;
import vn.edu.bridge_pattern.devices.Radio;
import vn.edu.bridge_pattern.devices.Tv;
import vn.edu.bridge_pattern.remotes.AdvancedRemote;
import vn.edu.bridge_pattern.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevive(new Radio());
		testDevive(new Tv());
	}
	
	public static void testDevive(Device device) {
		System.out.println("Test wwith BasicRemote");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Test with AdvancedRemote");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}