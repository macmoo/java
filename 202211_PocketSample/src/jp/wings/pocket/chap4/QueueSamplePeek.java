package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSamplePeek {
	public static void main(String[] args){

		Queue<String> queue = new LinkedList<>();
		System.out.println("peek: " + queue.peek());
		queue.addAll(Arrays.asList("A","B","C"));
		System.out.println("peek: " + queue.peek());
		System.out.println("element: " + queue.element());
	}
}
