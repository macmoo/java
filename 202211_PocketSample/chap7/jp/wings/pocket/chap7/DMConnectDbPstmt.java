package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DMConnectDbPstmt {
	public static void main(String[] args) {

		// try-with-resources構文でのprepareStatement実行
		try (Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				PreparedStatement stmt = con.prepareStatement("UPDATE user_list SET name = ? WHERE id = ?");) {

			// 1番目のプレースホルダに文字列、 2番目に2をセットする
			stmt.setString(1,"Rino Sashihara" );
			stmt.setInt(2, 2);
			// プリペアドステートメントを実行し、結果の件数を表示
			System.out.println( stmt.executeUpdate());
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}