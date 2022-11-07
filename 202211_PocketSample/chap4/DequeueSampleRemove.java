package jp.wings.pocket.chap4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class DequeueSampleRemove {
	public static void main(String[] args){

		Deque<Integer> deq = new ArrayDeque<>(Arrays.asList(1,2,3));
		System.out.println("Deque: " + deq);	// 結果：Deque: [1, 2, 3]
		System.out.println(deq.removeFirst());	// 結果：1
		System.out.println(deq.removeLast());	// 結果：3
		System.out.println(deq.pollFirst());		// 結果：2
		System.out.println(deq.pollLast());			// 結果：null
	}
}
