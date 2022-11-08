package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DMConnectDbSample_SE7 {
	public static void main(String[] args) {

		Connection con = null;
		try {
			// データベースに接続
			con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/wings_db","scott", "tiger");
		    System.out.println("接続しました");  // エラーがなければ表示
		}
		catch (SQLException e) {
		    System.out.println("接続に失敗しました" + e.getMessage());
		}
		finally {
			try {
				if (con!=null ) con.close(); // 切断処理が必ず必要
			} catch (Exception e) {
			}
		}

		// try-with-resources構文なら明示的なcloseの必要がない
		try (Connection con2 =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db","scott", "tiger");){
			System.out.println("接続しました");  // エラーがなければ表示される
		}
		catch (SQLException e) {
			System.out.println("接続に失敗しました; "+e.getMessage());
		}
	}
}