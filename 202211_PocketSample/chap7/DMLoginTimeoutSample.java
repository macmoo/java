package jp.wings.pocket.chap7;

import java.sql.DriverManager;

public class DMLoginTimeoutSample {
	public static void main(String[] args) {

		try {
			// デフォルトのタイムアウト値を表示
		    System.out.println("timeout:" + DriverManager.getLoginTimeout());

			// 接続タイムアウトを100秒に設定
			DriverManager.setLoginTimeout(100);
			System.out.println( "timeout:" + DriverManager.getLoginTimeout());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}