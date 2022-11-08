package jp.wings.pocket.chap3;

import java.util.Date;

//現在時刻を文字列で表現します。
public class ToStringDate{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println("現在時刻 " + date.toString());
	}
}
