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
		System.out.println("����ȫ�������밴1��ָ�������밴2��");
		int n=in.nextInt();
		switch(n) {
		case 1:
			 System.out.println(listsong.get(0).toString()); 
			break;
		case 2:
			System.out.println("������ָ�����Ÿ�������");
			for(Song listsong:listsong) {
				if(listsong.equals(in.nextLine()))
					System.out.println(in.nextLine()+"���ųɹ�");
				else
					System.out.println("�ø���������");
			}
			break;
			default:
				break;
		}
		return true;}
	
}
