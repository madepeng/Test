package com.test.comparable;

public class Song implements Comparable<Song> {

		private String title;
		private String artile;
		private String rating;
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return title.compareToIgnoreCase(o.getTitle());
	}
	public Song() {
		super();
	}
	public Song(String title, String artile, String rating) {
		super();
		this.title = title;
		this.artile = artile;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtile() {
		return artile;
	}
	public void setArtile(String artile) {
		this.artile = artile;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

}
