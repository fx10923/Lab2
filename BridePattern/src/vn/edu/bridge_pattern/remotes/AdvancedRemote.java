package vn.edu.bridge_pattern.remotes;

import vn.edu.bridge_pattern.devices.Device;

public class AdvancedRemote extends BasicRemote {
	
	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("Remote: mute");
        device.setVolume(0);
	}
}
