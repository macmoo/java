package jp.wings.pocket.chap4;

import java.util.concurrent.LinkedBlockingDeque;

public class QueueSampleAdd {
	public static void main(String[] args){

		// 容量が2のLinkedBlockingDeque
		LinkedBlockingDeque<String> queue = new LinkedBlockingDeque<>(2);

		System.out.println("add A: " + queue.add("A"));
		System.out.println("add B: " + queue.add("B"));
		try {
			System.out.println("add C: " + queue.add("C"));
		}
		catch(Exception e){
			System.out.println("例外発生:"+e.getMessage());
		}
		System.out.println("add C: " + queue.offer("C"));
	}
}
