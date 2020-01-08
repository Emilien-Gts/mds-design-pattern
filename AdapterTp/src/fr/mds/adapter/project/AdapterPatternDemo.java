package fr.mds.adapter.project;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "mp3_sound.mp3");
		audioPlayer.play("mp4", "mp4_sound.mp4");
		audioPlayer.play("vlc", "vlc_movie.vlc");
		audioPlayer.play("avi", "avi_movie.avi");

		MediaPlayer player = new MediaAdapter("mp4");
		player.play("mp4", "bad_movie.mp4");

		MediaPlayer player1 = new AudioPlayer();
		player1.play("mp4", "bad_movie2.mp4");
	}
}

