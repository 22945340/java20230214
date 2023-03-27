package ch08.sec05;

public class Television implements RemoteControl, ch08.sec06.RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

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
		System.out.println("현재 TV 볼륨: " + this.volume);

	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		ch08.sec06.RemoteControl.super.setMute(mute);
	}

}
