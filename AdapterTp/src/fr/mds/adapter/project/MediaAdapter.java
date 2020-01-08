package fr.mds.adapter.project;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String type) {
		if (type.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (type.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String type, String name) {
		if (type.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(name);
		} else if (type.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(name);
		}
	}
}
