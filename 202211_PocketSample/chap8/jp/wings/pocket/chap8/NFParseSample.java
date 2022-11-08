package jp.wings.pocket.chap8;

import java.text.NumberFormat;
import java.text.ParseException;

public class NFParseSample {
	public static void main(String[] args) {
		try {
			NumberFormat nf = NumberFormat.getInstance();
			System.out.println(nf.parse("100.8です"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
