package fr.mds.adapter.project;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String name) {}

	@Override
	public void playMp4(String name) {
		System.out.println("Mp4 - Name: " + name);
	}
}
