package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSCursorSample {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement st = con.createStatement();) {

			ResultSet rs = st.executeQuery("SELECT * FROM user_list ORDER BY id");

			// カーソルを移動させ、そのカーソルが指す行を出力
			rs.first();
			System.out.println("最初の行 " + rs.getInt("id") + " " + rs.getString("name"));
			rs.next();
			System.out.println("その次 " + rs.getInt("id") + " " + rs.getString("name"));
			rs.last();
			System.out.println("最後の行 " + rs.getInt("id") + " " + rs.getString("name"));
			rs.previous();
			System.out.println("その前 " + rs.getInt("id") + " " + rs.getString("name"));
			rs.absolute(3);
			System.out.println("前から3行目 " + rs.getInt("id") + " " + rs.getString("name"));
			rs.relative(-2);
			System.out.println("その2行前 " + rs.getInt("id") + " " + rs.getString("name"));
		} catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
