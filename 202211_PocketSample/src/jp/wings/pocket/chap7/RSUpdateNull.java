package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSUpdateNull {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				// 更新可能のResultSetにする
				Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);) {
			ResultSet rs = st.executeQuery("SELECT id,name FROM user_list");
			while (rs.next()) {
				if (rs.getInt(1) == 2) {	// IDが2なら
					rs.updateNull(2);		// name列をNULLで更新
					rs.updateRow();		// 更新の反映
				}
			}
			// name列がNULLのレコードを取得する
			ResultSet rsa = st.executeQuery("SELECT name FROM user_list WHERE name IS NULL");
			System.out.println(rsa.next());	// 結果: true
		} catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}