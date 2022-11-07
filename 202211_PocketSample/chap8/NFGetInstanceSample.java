package jp.wings.pocket.chap8;

import java.text.NumberFormat;
import java.util.Locale;

public class NFGetInstanceSample {
	public static void main(String[] args) {
		NumberFormat nf1 = NumberFormat.getInstance(Locale.JAPAN);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.UK);
		NumberFormat nf5 = NumberFormat.getPercentInstance(Locale.JAPAN);
		NumberFormat nf6 = NumberFormat.getPercentInstance(Locale.US);
		System.out.println(
				"日本：" + nf1.format(10000.01) + "、イタリア：" + nf2.format(10000.01));
		System.out.println(
				"日本：" + nf3.format(10000) + "、イギリス：" + nf4.format(10000));
		System.out.println(
				"日本：" + nf5.format(0.235) + "、アメリカ：" + nf6.format(0.235));
	}
}
