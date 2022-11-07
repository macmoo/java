package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;

public class TRSetGetAutoSample {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				) {

			// オートコミットモードがonになっている場合、offに設定
			if (con.getAutoCommit()) {
				// オートコミットしない
				con.setAutoCommit(false);
				System.out.println("オートコミットモードをoffにしました");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
