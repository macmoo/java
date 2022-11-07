package jp.wings.pocket.chap3;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeInstant {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		// Dateオブジェクトを変換する
		LocalDateTime date1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		ZonedDateTime date2 = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		OffsetDateTime date3 = OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);

	}
}
