package Spotify.Search;

import java.util.ArrayList;
import java.util.List;

import Spotify.Song;

public class SearchByAlbum implements Search {

	@Override
	public List<Song> searchSongs(String searchText) {
		/*
		 *	Logic to search by album in DB.
		 *	Return top 'k'
		 */ 
		
		// assuming search text is "St"
		List<Song> songs = new ArrayList<>();
		return songs;
	}

}