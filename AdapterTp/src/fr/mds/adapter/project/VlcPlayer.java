package fr.mds.adapter.project;

public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String name) {
		System.out.println("Vlc - Name: " + name);
	}

	@Override
	public void playMp4(String name) {}
}

