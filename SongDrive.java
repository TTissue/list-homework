package com.homework;
public class SongDrive {
	public  Master master;
	public  Player player;
	public SongDrive() {
		master=new Master();
		player=new Player();
	}
	public static void main(String[] args) {
		SongDrive sd=new SongDrive();
		sd.player.addsong();
		sd.master.play();
	}
}
