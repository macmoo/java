package jp.wings.pocket.chap2;

public class OperatorSample1 {
	public static void main(String[] args) {

		int a = 1, b = 2, x = 3, y = 4;
		a = a * 2 - b; // a*2の次のbが減算される
		x = x >> y + 3; // y+3が先に処理される

		System.out.println(a);
		System.out.println(x);

		x = 5;
		y = x++; // *1
		System.out.println(y); // 結果：5

		x = 5;
		y = ++x; // *2
		System.out.println(y); // 結果：6

		x = 15; y = 16;
		System.out.println((x + y) / 2); // 結果：15.5ではない

		x = 17; y = 4;
		System.out.println(x % y);   // 結果：1
		System.out.println(x % 4.5); // 結果：3.5

	}

}
