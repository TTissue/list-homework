package com.homework;
import java.util.*;
@SuppressWarnings("null")

public class Player {
	Scanner in =new Scanner(System.in);
	public boolean addsong() {
		System.out.println("�������������");
		String sn=in.nextLine();
		System.out.println("��������֣�");
		String sg=in.nextLine();
		System.out.println("���������ʱ�䣺");
		double t=in.nextDouble();
		 Song song=new Song(sn,sg,t);
		Master.listsong.add(song);
		return true;
		
	}
}
