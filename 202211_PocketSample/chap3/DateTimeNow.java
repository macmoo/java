package jp.wings.pocket.chap3;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeNow {
	public static void main(String[] args) {

		// デフォルトの日時
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(date1);

		// アメリカ / ロサンゼルスの日時
		LocalDateTime date1_usa = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(date1_usa);

		// UTCからの時差つき
		OffsetDateTime date2 = OffsetDateTime.now();
		System.out.println(date2);

		// タイムゾーンつき
		ZonedDateTime date3 = ZonedDateTime.now();
		System.out.println(date3);

	}
}
