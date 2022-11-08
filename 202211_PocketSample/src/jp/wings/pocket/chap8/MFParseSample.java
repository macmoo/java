package jp.wings.pocket.chap8;

import java.text.MessageFormat;
import java.text.ParseException;

public class MFParseSample {
	public static void main(String[] args) {
		try {
			MessageFormat form = new MessageFormat("{0}さんは{1}さんの先輩です。");
			String message = "MaedaさんはAkimotoさんの先輩です。";
			for (Object o : form.parse(message)) {
				System.out.println(o);
			}
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
