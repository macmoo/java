package jp.wings.pocket.chap4;

import java.util.ArrayDeque;
import java.util.Deque;

public class OccurrenceSample {
	public static void main(String[] args) {

		Deque<String> deq = new ArrayDeque<>();
		deq.push("A");
		deq.push("B");
		deq.push("A");
		deq.push("B");
		System.out.println(deq); // 結果：[B, A, B, A]

		// 最初の"B"を削除
		deq.removeFirstOccurrence("B");
		System.out.println(deq); // 結果：[A, B, A]

		// 最後の"A"を削除
		deq.removeLastOccurrence("A");
		System.out.println(deq); // 結果：[A, B]
	}
}
