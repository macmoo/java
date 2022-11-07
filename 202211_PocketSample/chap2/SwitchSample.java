package jp.wings.pocket.chap2;

public class SwitchSample {
	public static void main(String[] args) {

		int value = 2;
		switch (value) {

		// valueが1の場合
		case 1:
			System.out.println("first");
			break;

		// valueが2の場合
		case 2:
			System.out.println("second");
			break;
		}

		switch (value) {
		case 1:
			System.out.println("first");
		case 2:
		case 3:
			System.out.println("second");
			break;
		}
		// 文字列型の例
		String str_value = "abc";
		switch (str_value) {

		case "abc":
			System.out.println(str_value);
			break;

		case "def":
			System.out.println(str_value);
			break;

		}
	}
}
