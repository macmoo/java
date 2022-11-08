package jp.wings.pocket.chap4;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackSample {
	public static void main(String[] args){

		Deque<String> deq = new ArrayDeque<>();
		deq.push("A"); deq.push("B");
		System.out.println(deq); // 結果：[B, A]

		// 先頭の参照
		System.out.println(deq.peek()); // 結果：B

		deq.push("C");
		// 先頭を取得して削除
		System.out.println(deq.pop()); // 結果：C
		System.out.println(deq); // 結果：[B, A]
	}
}
