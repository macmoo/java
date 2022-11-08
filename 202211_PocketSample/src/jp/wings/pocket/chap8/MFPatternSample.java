package jp.wings.pocket.chap8;

import java.text.MessageFormat;

public class MFPatternSample {
	public static void main(String[] args) {
		Object[] argment = { "Maeda", "Akimoto" };
		MessageFormat form = new MessageFormat("{0}さんは{1}さんの先輩です。");
		System.out.println("現在のパターン：" + form.toPattern());
		form.applyPattern("{1}さんは{0}さんの後輩です。");
		System.out.println(form.format(argment));
	}
}
