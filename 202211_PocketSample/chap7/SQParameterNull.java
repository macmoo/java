package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQParameterNull {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement st = con.createStatement();
				PreparedStatement pst = con.prepareStatement(
						// IDを最大ID+1の値にして挿入する
						"INSERT INTO user_list ( id, name ) VALUES (" + " (SELECT max_id + 1 FROM ("
								+ " SELECT MAX(id) AS max_id FROM user_list ) AS t ),?)");) {

			pst.setNull(1, java.sql.Types.VARCHAR); // NULLの指定
			System.out.printf("レコード追加: %d\n", pst.executeUpdate());

			// nameがnullのレコードがあるかどうか
			ResultSet rs = st.executeQuery("SELECT *  FROM user_list WHERE name IS NULL");
			System.out.println(rs.next()); // 結果:true
		} catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}