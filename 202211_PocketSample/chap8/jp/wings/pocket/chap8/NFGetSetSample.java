package jp.wings.pocket.chap8;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NFGetSetSample {
	public static void main(String[] args) {
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		nf1.setParseIntegerOnly(true);
		nf1.setGroupingUsed(false);
		nf2.setCurrency(Currency.getInstance(Locale.ITALY));
		System.out.println("整数のみ解析：" + nf1.isParseIntegerOnly());
		System.out.println("グループ化：" + nf1.isGroupingUsed());
		System.out.println("通貨：" + nf2.getCurrency());
	}
}
