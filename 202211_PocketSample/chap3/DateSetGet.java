package jp.wings.pocket.chap3;

import java.util.Date;

//生成したDateオブジェクトから、エポックからのミリ秒数を取得し、さらに時刻を再度設定します。
class DateSetGet{
	public static void main(String[] args){
		Date date = new Date();
		long now;
		now = date.getTime();
		System.out.println("現在時刻 " + date.toString());
		date.setTime(now + 30000); //現在時刻（ミリ秒）に30秒加算
		System.out.println("再設定後 " + date.toString());
	}
}
