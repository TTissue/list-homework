package com.homework2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class testlist {
	public static void main(String[] args)
	{
		testlist t=new testlist();
 	//t.list(list1);
		t.list(list2);
		//t.list(list3);
		//t.list(list4);
	}
	static ArrayList<Integer> list1=new ArrayList<Integer>();
	static LinkedList<Integer> list2=new LinkedList<Integer>();
	static Vector<Integer> list3=new Vector<Integer>();	
	static Stack<Integer> list4=new Stack<Integer>();
	
	//返回测试的类名称
	private static String getName(List<Integer> list) {
        String name = "";
        if(list instanceof ArrayList){
            name = "ArrayList";
        }
        else if(list instanceof LinkedList){
            name = "LinkedList";
        }
        else if(list instanceof Vector){
            name = "Vector";
        }
        else
        	name="Stack";
        return name;
    }
	
	//设置规模为一万到一百万，分别测试插入，查找，删除数据所用时间并打印输出
	public void list(List<Integer> list)
	{	
		for(int i=1000;i<1000000;i=i+200000)
		{
			long startTime=System.currentTimeMillis();
			for(int j=0;j<i;j++)
			{
				list.add(0,j);				//插入数据
			}	
			long endTime=System.currentTimeMillis();
			System.out.println("插入"+i+"个数据"+getName(list)+"需要的时间为："+(endTime-startTime));
			
			long startTime2=System.currentTimeMillis();
			for(int k=0;k<i;k++)
			{
				list.get(k);			//查找数据
			}
			long endTime2=System.currentTimeMillis();
			System.out.println("长度为"+i+"时"+getName(list)+"的查找时间为："+(endTime2-startTime2));
			
			long startTime3=System.currentTimeMillis();
			list.removeAll(list);				//删除数据
			long endTime3=System.currentTimeMillis();
			System.out.println("长度为"+i+"时"+getName(list)+"的删除时间为："+(endTime3-startTime3)+"\n");
		}
		
	}

}
