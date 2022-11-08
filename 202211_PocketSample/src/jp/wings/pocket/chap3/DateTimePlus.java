package jp.wings.pocket.chap3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimePlus {
	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.parse("2015-10-12T11:03");

		System.out.println(date1.plusMonths(3)); 	// 月を3加算する
		System.out.println(date1.minusDays(20)); 	// 日を20減算する
		System.out.println(date1.plus(15, ChronoUnit.HOURS)); 	// 時刻に15加算する

		Period period = Period.of(1, 2, 3); // 1年2ヶ月と3日
		System.out.println(date1.plus(period)); 	// 日数の加算

		Duration duration = Duration.of(60, ChronoUnit.MINUTES); // 60分の秒数
		System.out.println(date1.plus(duration)); 	// 秒数の加算
	}

}
