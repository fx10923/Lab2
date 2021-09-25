package vn.edu.bridge_pattern.devices;

public interface Device {
	boolean isEnabled();
	
	void enable();
	
	void disable();
	
	int getVolume();
	
	void setVolume(int percent);
	
	int getChannel();
	
	void setChannel(int channel);
	
	void printStatus();
}