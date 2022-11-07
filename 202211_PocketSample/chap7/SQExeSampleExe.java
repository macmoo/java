package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQExeSampleExe {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			// executeUpdateを用いて結果を返さないようなSQL文の実行
			int count = stmt.executeUpdate("UPDATE user_list SET name='Minami Takahashi' WHERE id =10");
			System.out.println(count + "件更新しました");
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}