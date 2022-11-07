package jp.wings.pocket.chap8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REMatchesSample {
	public static void main(String[] args) {
		String html = "<font color=\"red\">Hello</font>";

		Pattern pattern = Pattern.compile("<[\\w\\s/=\"]+>"); // 英字1文字以上の文字列
		Matcher matcher = pattern.matcher(html);
		System.out.println("matcher.matches():" + matcher.matches());
		System.out.println("matcher.lookingAt():" + matcher.lookingAt()
				+ ":(" + matcher.start()
				+ "～" + matcher.end()
				+ ":" + matcher.group() + ")");
		System.out.println("matcher.find():" + matcher.find()
				+ ":(" + matcher.start()
				+ "～" + matcher.end()
				+ ":" + matcher.group() + ")");
	}
}

