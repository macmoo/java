package jp.wings.pocket.chap3;

//「13」を、16進数と10進数で表現します。
public class CHDigitSample {
	public static void main(String[] args) {
		System.out.println(Character.digit('D', 16));
		System.out.println(Character.forDigit(13, 16));
	}
}