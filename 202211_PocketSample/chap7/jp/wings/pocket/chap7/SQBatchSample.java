package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQBatchSample {
	public static void main(String[] args) {
		// データの挿入と更新をまとめて行う
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			// 実行リストに追加（挿入と更新）
			stmt.addBatch("INSERT INTO user_list(id,name) VALUES (5,'Mayu Watanabe')");
			stmt.addBatch("UPDATE user_list SET name='Minami Takahashi' WHERE id =5");

			// まとめて実行
			int[] ret = stmt.executeBatch();
			for (int i : ret) {
				System.out.printf("結果: %d\n", i);
			}

			System.out.println("\n実行後");
			ResultSet after = stmt.executeQuery("SELECT * FROM user_list ORDER BY id");
			while (after.next()) {
				System.out.printf("%s %s%n", after.getString("id"), after.getString("name").toString());
			}
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
