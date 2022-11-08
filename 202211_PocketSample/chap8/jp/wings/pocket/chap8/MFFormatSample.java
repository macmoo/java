package jp.wings.pocket.chap8;

import java.text.MessageFormat;

public class MFFormatSample {
	public static void main(String[] args) {
		StringBuffer message = new StringBuffer();
		Object[] argument1 = { new Integer(250), "ブレンド" };
		Object[] argument2 = { new Integer(280), "カフェラテ" };
		MessageFormat form = new MessageFormat("{1}は\\{0}です。");
		System.out.println(form.format(argument1, message, null));
		form.format(argument2, message, null);
		System.out.println(message);
	}
}
