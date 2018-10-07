package com.homework;
import java.util.*;

public class Master {
	Scanner in =new Scanner(System.in);
	static List<Song>listsong;
	public Master() {
		listsong=new ArrayList<Song>();
	}
	@SuppressWarnings("unlikely-arg-type")
	public boolean play() {
		System.out.println("播放全部歌曲请按1，指定播放请按2：");
		int n=in.nextInt();
		switch(n) {
		case 1:
			 System.out.println(listsong.get(0).toString()); 
			break;
		case 2:
			System.out.println("请输入指定播放歌曲名：");
			for(Song listsong:listsong) {
				if(listsong.equals(in.nextLine()))
					System.out.println(in.nextLine()+"播放成功");
				else
					System.out.println("该歌曲不存在");
			}
			break;
			default:
				break;
		}
		return true;}
	
}
