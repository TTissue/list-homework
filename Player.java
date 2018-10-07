package com.homework;
import java.util.*;
@SuppressWarnings("null")

public class Player {
	Scanner in =new Scanner(System.in);
	public boolean addsong() {
		System.out.println("请输入歌曲名：");
		String sn=in.nextLine();
		System.out.println("请输入歌手：");
		String sg=in.nextLine();
		System.out.println("请输入歌曲时间：");
		double t=in.nextDouble();
		 Song song=new Song(sn,sg,t);
		Master.listsong.add(song);
		return true;
		
	}
}
