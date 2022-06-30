package jungsuk07;

public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		
	}
}

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int beforeChannel;
	
	final int MAX_COLUME = 100;
	final int MIX_COLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIX_CHANNEL = 1;
	
	public void setPowerOn() {
		isPowerOn = !isPowerOn;
	}
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	
	public void setChannel(int channel) {
		this.beforeChannel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	void gotoPrevChannel() {
		setChannel(beforeChannel);
	}
}