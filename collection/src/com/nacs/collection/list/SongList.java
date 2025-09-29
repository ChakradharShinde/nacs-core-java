package com.nacs.collection.list;

import java.util.LinkedList;

import com.nacs.collection.list.entities.Song;

public class SongList {
	LinkedList<Song> playList = new LinkedList<>();

	public String addSong(Song song) {
		return playList.add(song) ? "Song Added.." : "Error Occured..";
	}

	public String addSongAtIndex(int index, Song song) {
		playList.add(index, song);
		return "Song added at Index " + index;
	}

	public String removeSong(Song song) {
		return playList.remove(song) ? "Song Removed.." : "Error Occured..";
	}

}
