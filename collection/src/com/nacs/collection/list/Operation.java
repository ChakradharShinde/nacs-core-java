package com.nacs.collection.list;

import java.util.Stack;

import com.nacs.collection.list.entities.Song;

public class Operation {
	Stack<Song> playList = new Stack<>();

	public void addSong(Song song) {
		playList.push(song);
	}

	public Song previousSong() {
		playList.pop();
		return playList.peek();
	}

}
