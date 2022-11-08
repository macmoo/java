package jp.wings.pocket.chap3;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeToInstant {
	public static void main(String[] args) {

		LocalDateTime local = LocalDateTime.now();
		// ZoneOffsetを指定
		Date date = Date.from(local.toInstant(ZoneOffset.of("+09:00")));
		System.out.println(date);

		OffsetDateTime offset  = OffsetDateTime.now();
		Date odate = Date.from(offset.toInstant());
		System.out.println(odate);

		ZonedDateTime zone  = ZonedDateTime.now();
		Date zdate = Date.from(zone.toInstant());
		System.out.println(zdate);
	}
}
