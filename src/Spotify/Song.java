package Spotify;

public class Song {
	private Long songId;
	private String name;
	private String album;
	
	public Long getSongId() {
		return songId;
	}
	public void setSongId(Long songId) {
		this.songId = songId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void play() {
		System.out.println("Song is Playing");
	}
	
	public void pause() {
		System.out.println("Song has been Paused");
	}
}
