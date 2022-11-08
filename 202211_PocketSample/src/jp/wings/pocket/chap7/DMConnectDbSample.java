package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// データベースに接続
public class DMConnectDbSample {
	public static void main(String[] args) {

		// Connectionオブジェクト
		Connection con = null;
		try {
			// 接続処理
			con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/wings_db","scott", "tiger");
			System.out.println("接続しました");  // エラーがなければ表示される
		}
		catch (SQLException e) {
			System.out.println("接続に失敗しました; "+e.getMessage());
		}
		finally {
			try {
				// 切断処理
				if (con!=null ) con.close();
		        System.out.println("切断しました");
			} catch (Exception e) {
			}
		}
	}
}