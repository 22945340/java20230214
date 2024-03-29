package ch08.sec05;

public class Audio implements RemoteControl, ch08.sec06.RemoteControl{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_BOLUME) {
			this.volume = RemoteControl.MAX_BOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
		
	}
	
	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else{
			System.out.println("무음해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
	
	
}
