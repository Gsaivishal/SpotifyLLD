package Spotify.Search;

import java.util.List;
import Spotify.Song;

/*
 *	Strategy Pattern to search songs in diff. ways 
 */

public interface Search {
	public List<Song> searchSongs(String searchText);
}
