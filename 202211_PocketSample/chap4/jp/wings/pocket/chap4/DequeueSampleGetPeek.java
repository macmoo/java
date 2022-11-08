package jp.wings.pocket.chap4;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeueSampleGetPeek {
	public static void main(String[] args){

		Deque<Character> deq = new ArrayDeque<>();
		deq.addFirst('あ');
		deq.addFirst('い');
		System.out.println(deq); // 結果：[い, あ]

		try {
			System.out.println(deq.getFirst()); // 結果：い
			deq.clear(); // キューを全削除
			System.out.println(deq.peekFirst()); // 結果：null
			System.out.println(deq.getLast());
		}
		catch (Exception e) {
			// deq.getLast()で発生
		}
	}
}
