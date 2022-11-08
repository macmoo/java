package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSUpdateSample {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				// 更新可能のResultSetにする
				Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);) {

			// プライマリーキーを含める
			ResultSet rs = st.executeQuery("SELECT id,name FROM user_list");

			while (rs.next()) {
				String name = rs.getString("NAME");
				if (name != null) {
					// name列の内容を大文字に更新する
					rs.updateString("NAME", name);
					// データの更新
					rs.updateRow();
				}
			}

			// 更新後のデータを表示する
			ResultSet rsa = st.executeQuery("SELECT * FROM user_list");
			while (rsa.next()) {
				System.out.println(rsa.getString("id") + " " + rsa.getString("name"));
			}

		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}