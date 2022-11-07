package jp.wings.pocket.chap8;

import java.text.MessageFormat;
import java.text.ParsePosition;

public class MFParseSampleError {
	public static void main(String[] args) {
		MessageFormat form = new MessageFormat("{0}さんは{1}さんの先輩です。");
		String message = "Maedaさんは先輩です。";
		ParsePosition pos = new ParsePosition(0);
		Object[] obj = form.parse(message, pos);
		if (obj!=null) {
			for (Object o : obj) {
				System.out.println(o);
			}
		}
		else {
			System.out.println("エラー位置:"+pos.getErrorIndex());
		}
	}
}
