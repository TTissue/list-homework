package com.homework;

public class Song {
	String songname;
	String singer;
	double time;
	public Song(String songname,String singer,double time) {
		this.songname=songname;
		this.singer=singer;
		this.time=time;
		
	}
	public String toString()
	{
		StringBuffer s=new StringBuffer("");
		s.append("歌曲名:"+songname);
		s.append("歌手:"+singer);
		s.append("歌曲时长:"+time);
		return s.toString();	
	}
}
