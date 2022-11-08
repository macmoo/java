package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSGetDate {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement st = con.createStatement(); ) {
			ResultSet rs = st.executeQuery("SELECT CURRENT_TIMESTAMP(), CURRENT_TIME()");
			rs.next();
			// 日付時刻の取得
			System.out.println("getDate: "+rs.getDate(1));
			System.out.println("getTime: "+rs.getTime(2));
			System.out.println("getTimestamp: "+rs.getTimestamp(1));
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
