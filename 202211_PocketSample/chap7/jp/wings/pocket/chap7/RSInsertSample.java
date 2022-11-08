package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSInsertSample {
	public static void main(String[] args) {

		// データを挿入する領域にカーソルを移動し、新しい行を挿入
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
			Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
			ResultSet rs = st.executeQuery("SELECT id, name FROM user_list ORDER BY id");

			// 挿入行に移動
			rs.moveToInsertRow();
			rs.updateInt(1, 10);
			rs.updateString(2, "Sayaka Yamamoto");
			// 挿入実行
			rs.insertRow();
			// 行復帰（この場合は先頭の前）
			rs.moveToCurrentRow();
			rs.next();
			System.out.println(rs.getString("id")); // 結果：1
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
