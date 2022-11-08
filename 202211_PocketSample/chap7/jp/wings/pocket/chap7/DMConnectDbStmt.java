package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMConnectDbStmt {
	public static void main(String[] args) {

		// try-with-resources構文でのcreateStatement実行
		try (Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			System.out.println(stmt.execute("SELECT * FROM user_list"));
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}