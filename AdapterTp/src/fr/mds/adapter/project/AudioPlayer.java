package fr.mds.adapter.project;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String type, String name) {

		if (type.equalsIgnoreCase("mp3")) {
			System.out.println("Mp3 - Name: " + name);
		}
		else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.play(type, name);
		}
		else {
			System.out.println("Error type : " + type);
		}
	}
}
