package com.jsp.Making_Music_Player_App;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	public Album(String name, String artist, ArrayList<Song> songs) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	public Album() {
		
	}
	public Song findsong(String title) {// Its is checking the song present or not
		for(Song checkedsong: songs) {
			if(checkedsong.getTitle().equals(title))
				return checkedsong;
				
		}
			
		
		return null;
			
		
		
	}
	public boolean addsong(String title,double duration) {
		if(findsong(title)==null) {
			songs.add(new Song(title,duration));
			//System.out.println(title+"sucessfully added to the list");
			return true;
		}
		else {
			//System.out.println("song with name "+title+"already exist in the list");
		return false;
		}
		
		
	}
	public boolean addToPlayList(int tracknumber,LinkedList<Song> playList) {
		int index=tracknumber-1;
		if(index>0 && index <=this.songs.size()) {
			playList.add(this.songs.get(index));
			return true;
		}
		//System.out.println("this album does not have song with tracknumber"+tracknumber);
		return false;
	}
	public boolean addtoPlayList(String title,LinkedList<Song>playList) {
		for(Song checked:this.songs) {
			if(checked.getTitle().equals(title)) {
				playList.add(checked);
				return true;
			}
		}
		//System.out.println(title+"there is no such song in album");
		return false;
	}
	

}
