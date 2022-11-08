package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQExeSampleOne {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			// executeQueryを用いて単一の結果を返すようなSQL文の実行
			ResultSet rs1 = stmt.executeQuery("SELECT * FROM user_list");
			while (rs1.next()) {
				System.out.println(rs1.getInt("id") + " " + rs1.getString("name"));
			}
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}