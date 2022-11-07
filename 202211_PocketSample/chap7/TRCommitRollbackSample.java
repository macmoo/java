package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TRCommitRollbackSample {
	public static void main(String[] args) {

		// データ追加時に例外が発生すれば ロールバック処理を行う
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			con.setAutoCommit(false); // オートコミットをしない
			try {
				stmt.executeUpdate("UPDATE user_list SET name = 'Sayaka' WHERE id = 3");
				stmt.executeUpdate("INSERT INTO user_list(id,name) VALUES(3,'Haruna Kojima')");
				con.commit();
			}
			catch (SQLException e) {
				// 何らかのエラーが生じた場合にはロールバック
				con.rollback();
				System.out.println("ロールバック: " + e.getMessage());
			}

			ResultSet rs = stmt.executeQuery("SELECT * FROM user_list WHERE id = 3");
			rs.next();
			// ロールバックによりUPDATEが取り消され元の値のままになる
			System.out.println(rs.getString("name")); 
		}
		catch (SQLException e) {
			System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
