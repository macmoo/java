package jp.wings.pocket.chap2;

import static java.lang.Math.*;

class StaticSample {

	enum Status {
		STAT1, STAT2, STAT3;
	}

	public static void main(String[] args) {

		System.out.println(PI); // Mathクラス名が省略できる

		int value = 1;

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

		String str_value = "abc";

		switch (str_value) {

		case "abc":
			System.out.println(str_value);
			break;

		case "def":
			System.out.println(str_value);
			break;

		}

		Status s = Status.STAT3;

		switch (s) {

		case STAT1:
			System.out.println(s);
			break;

		case STAT2:
			System.out.println(s);
			break;

		case STAT3:
			System.out.println(s);
			break;
		}

	}

}