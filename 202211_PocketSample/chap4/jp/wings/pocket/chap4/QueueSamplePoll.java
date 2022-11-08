package jp.wings.pocket.chap4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSamplePoll {
	public static void main(String[] args){

		Queue<String> queue = new LinkedList<>();
		queue.addAll(Arrays.asList("one","two","three"));

		System.out.println("poll: " + queue.poll());
		System.out.println("remove: " + queue.remove());
		System.out.println("queue: " + queue);

		}
}
