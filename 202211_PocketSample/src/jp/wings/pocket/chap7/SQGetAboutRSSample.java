package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQGetAboutRSSample {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			 // デフォルトの表示 
			System.out.println("最大取得行数：" + stmt.getMaxRows());
			System.out.println("列のバイト数：" + stmt.getMaxFieldSize());

			stmt.execute("SELECT * FROM user_list");
			ResultSet rs = stmt.getResultSet();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			System.out.println();

			// 行数と列のバイト数を制限 
			stmt.setMaxRows(2);
			stmt.setMaxFieldSize(3);
			System.out.println("最大取得行数：" + stmt.getMaxRows());
			System.out.println("列のバイト数：" + stmt.getMaxFieldSize());
			stmt.execute("SELECT * FROM user_list");

			ResultSet rs2 = stmt.getResultSet();
			while (rs2.next()) {
				System.out.println(rs2.getInt("id") + " " + rs2.getString("name"));
			}
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());			
		}
	}
}