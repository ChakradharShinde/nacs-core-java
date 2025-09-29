package com.nacs.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.nacs.collection.list.entities.Song;

public class MusicPlayer {
	List<Song> playList = new ArrayList<>();

	public Song playSongByIndex(int index) {
		return playList.get(index);
	}

	public Song playSongByDetails(Song song) {
		return playList.get(playList.indexOf(song));
	}

	public String addAllSong(List<Song> songList) {
		return playList.addAll(songList) ? "All Songs Added Successfully" : "Error Occured..";
	}

}
