package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQParameterSet {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				PreparedStatement pst = con
						.prepareStatement("SELECT * FROM user_list WHERE (id < ?) AND (name LIKE ?)");) {

			// IDが3より小さく、nameがRで始まるレコード
			pst.setInt(1, 3);
			pst.setString(2, "R%");

			// SQL文の実行
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}