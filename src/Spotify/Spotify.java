package Spotify;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Spotify {
	private List<Song> favorites;
	private List<Playlist> playlists;
	private PriorityQueue<Song> frequentSongs;
	
	public Playlist createPlaylist(String name) {
		Playlist playlist = new Playlist(name);
		playlists.add(playlist);
		return playlist;
	}
	
	public void addToFavorites(Song song) {
		favorites.add(song);
	}
	
	public List<Song> getFrequent() {
		System.out.println("Logic to return frquent songs from heap");
		return new ArrayList<>();
	}
	
	public void addToPlaylist(Playlist playlist, Song song) {
		playlist.songs.add(song);
	}
}
