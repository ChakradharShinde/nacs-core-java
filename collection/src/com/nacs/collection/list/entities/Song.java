package com.nacs.collection.list.entities;

import java.util.Objects;

public class Song {
	private String title;
	private String album;
	private String singer;

	public Song() {
	}

	public Song(String title, String album, String singer) {
		this.title = title;
		this.album = album;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		Song temp = (Song)obj;
		return temp.title.equals(this.title) 
				&& temp.album.equals(this.album) 
				&& temp.singer.equals(this.singer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, album, singer);
	}
	
	@Override
	public String toString() {
		return "\n" + title + ", " + album + ",\nsinger=" + singer;
	}

}









