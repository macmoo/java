package jp.wings.pocket.chap7;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RSGetTypeSample {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);) {
			ResultSet rs = st.executeQuery("SELECT * FROM user_list");

			// 設定されたカーソルの性質をしめす定数名を表示
			for (Field f : ResultSet.class.getFields()) {
				if (f.getInt(f) == rs.getType() | f.getInt(f) == rs.getConcurrency()) {
					System.out.println(f.getName());
				}
			}
		} catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
