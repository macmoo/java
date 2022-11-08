package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQExeSampleMulti {
	public static void main(String[] args) {
		try (Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			// 2つの結果セットを返すストアドプロシージャの登録
			stmt.executeUpdate(
					"CREATE or REPLACE PROCEDURE Multi() " +
					"begin SELECT * FROM user_list; " +
					"SELECT count(*) FROM user_list; end;");

			// ストアドプロシージャの呼び出し
			boolean bl = stmt.execute("call Multi()");
			if (bl) { // 結果セットがある場合 
				ResultSet rs = stmt.getResultSet(); // 最初の結果セット取得
				// 取得した結果セットを破棄しないで、次の結果セットを取得する
				if (stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT)){
					System.out.println("最初の結果セット");
					while (rs.next()) {
						System.out.println(rs.getInt("ID") + " " +
		                                             rs.getString("NAME"));
					}
					System.out.println("次の結果セット");
					ResultSet rs2 = stmt.getResultSet();
					while (rs2.next()) {
						System.out.println(rs2.getInt(1));
					}
				}
				System.out.println("次の結果セットはあるか？：" + stmt.getMoreResults());
			}
		}
		catch (SQLException e) {
			System.out.println("処理に失敗しました; "+e.getMessage());
		}
	}
}