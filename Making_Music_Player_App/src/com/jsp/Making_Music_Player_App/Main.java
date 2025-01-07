package com.jsp.Making_Music_Player_App;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums=new ArrayList<>();
	public static void main(String[] args) {
		 Album album=new Album("Album1","Ac/Dc",null);
		 album.addsong("TNT", 4.5);
		 album.addsong("Highway to hell", 3.5);
		 album.addsong("Thunder	Struck", 5.0);
		 albums.add(album);
		 
		 album=new Album("Album2","Eminem", null);
		 
		 album.addsong("Rap god", 4.5);
		 album.addsong("Not Afraid", 3.5);
		 album.addsong("Lose yourself", 5.0);
		 albums.add(album);
		 
		 LinkedList<Song>playList_1=new LinkedList<>();
		 albums.get(0).addtoPlayList("TNT", playList_1);
		 albums.get(0).addtoPlayList("Highway to hell", playList_1);
		 albums.get(1).addtoPlayList("Rap god", playList_1);
		 albums.get(1).addtoPlayList("Lose youerself", playList_1);
		 play(playList_1);
		 
	}
	private static void play(LinkedList<Song> playList) {
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<Song> listIterator=playList.listIterator();
		
		if(playList.size()==0) {
			System.out.println("This playList have no song");
		}
		else {
			System.out.println("Now Playing"+listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			int action=sc.nextInt();
			sc.nextLine();
			
			
			switch(action) {
			
			case 0:
				System.out.println("PlayList complete");
				quit=true;
				break;
				
				
			case 1:
				if(!forward) {// Its is check only next song present or not
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward=true;
				}
				if(listIterator.hasNext()) {
					System.out.println("now playing "+listIterator.next().toString());
				}
				else {
					System.out.println("no song available .reached to the end of the list");
					forward=false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward=false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now Playing "+listIterator.previous().toString());
				}
				else {
					System.out.println("we are the first song");
				}
				break;
				
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing"+listIterator.previous().toString());
					forward=false;
					}
					else {
						System.out.println("we are at the start of the List");
					}
				}
				else {
				if(listIterator.hasNext()) {
					System.out.println("now playing"+listIterator.next().toString());
					forward=true;
					
				}
				else {
					System.out.println("we have reached to the end o the list");
				}
				
				}
				break;
			case 4:
				printList(playList);
				break;
				
			case 5:
				printMenu();
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now palying "+listIterator.next());
					}
					else {
						if(listIterator.hasPrevious()) {
							System.out.println("now palying"+listIterator.previous().toString());
						}
					}
				}
				
				
				
				
			}
		}
		
		
	}
	private static void printMenu() {
		System.out.println("Available options press");
		System.out.println("0 - to quit\n"+
		"1 - to play next song\n"+
		"2 - to play previous song\n"+
		"3 - to replay to current song\n"+
		"4 - List of all songs\n"+
		"5 - print all available option\n"+
		"6 - delete current song");
		
	}
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song>iterator=playList.iterator();
		System.out.println("======================");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("================");
	}
}


