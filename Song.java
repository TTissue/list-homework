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
		s.append("������:"+songname);
		s.append("����:"+singer);
		s.append("����ʱ��:"+time);
		return s.toString();	
	}
}
