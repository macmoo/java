package jp.wings.pocket.chap3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeParse {
	public static void main(String[] args) {

		LocalDateTime date1 = LocalDateTime.parse("2015-10-12T11:03");
		System.out.println(date1);

		try {
			LocalDateTime date2 = LocalDateTime.parse("2015-10-12");
			System.out.println(date2);
		}
		catch (DateTimeParseException e) {
			// 変換できない場合は、DateTimeParseExceptionがスローされる
			System.out.println("変換できない");
		}

		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy'年'MM'月'dd'日'H'時'm'分'");
		LocalDateTime date = LocalDateTime.parse("2015年10月12日13時45分",df);
		System.out.println(date);
	}

}
