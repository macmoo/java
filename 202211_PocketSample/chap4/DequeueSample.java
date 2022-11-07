package jp.wings.pocket.chap4;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeueSample {
	public static void main(String[] args){

		Deque<String> deq = new ArrayDeque<>();
		deq.addFirst("A");
		deq.addFirst("B");
		deq.addLast("C");
		deq.offerFirst("A");
		deq.offerLast("B");
		System.out.println(deq);
	}
}
