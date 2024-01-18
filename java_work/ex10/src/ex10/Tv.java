package ex10;

// 접근제어자
// public default protected private

public class Tv {
	public String color;
	public boolean power;
	public int channel;
	
	public void power() {
		System.out.println("power 누름");
		power = !power;
		
	}
	public void channelUp()   {  ++channel; }
	public void channelDown() { 
		--channel; 
		if(channel == -1) {
			channel = 0; // channel 음수일대 channel 초기화
		}
	}
}
