package Spotify;

import java.util.List;

public class Playlist {
	public Playlist(String name) {
		this.name = name;
		this.id = 1L;
	}
	public String name;
	public Long id;
	public List<Song> songs;
}
