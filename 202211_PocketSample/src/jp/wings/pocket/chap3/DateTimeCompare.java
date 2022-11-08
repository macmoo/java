package jp.wings.pocket.chap3;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCompare {
	public static void main(String[] args) {
		ZonedDateTime date1 = ZonedDateTime.now();
		ZonedDateTime date2 = date1.plusMonths(3); 	// 月を3加算する

		System.out.println(date1.compareTo(date2));   // 比較
		System.out.println(date1.isBefore(date2)); 			// 過去か？
		System.out.println(date1.isAfter(date2));   			// 未来か？
		System.out.println(date1.isEqual(date2));   		// 同じか？

		// 2015-10-12 1:00:00 +9.00
		ZonedDateTime date3 = ZonedDateTime.of(2015,10,12,1,0,0,0,ZoneId.of("Asia/Tokyo")); // +9.00
		// 2015-10-12 0:00:00 +8.00
		ZonedDateTime date4 = ZonedDateTime.of(2015,10,12,0,0,0,0,ZoneId.of("Asia/Hong_Kong")); // +8.00
		System.out.println(date3.isEqual(date4)); 			// 同一時刻か？
		System.out.println(date3.compareTo(date4));   // 比較
	}
}
