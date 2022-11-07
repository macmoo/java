package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSDeleteSample {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);) {

			ResultSet rs = st.executeQuery("SELECT id, name FROM user_list ORDER BY id");

			// 末尾に移動して削除
			rs.last();
			rs.deleteRow();

			// 先頭の前に移動
			rs.beforeFirst();

			// データ表示
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
		} catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
