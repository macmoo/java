package jp.wings.pocket.chap7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// データベースに接続
public class DMConnectDbStp {
	public static void main(String[] args) {

		try (Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement stmt = con.createStatement();) {

			// ストアドプロシージャの登録
			stmt.executeUpdate(
					"CREATE or REPLACE PROCEDURE wings_db.OUTPARAMNAME " +
					"(IN mid INT, OUT vname  TEXT) begin " +
					"SELECT name INTO vname FROM user_list WHERE id=mid; end;");

			// ストアドプロシージャの呼び出し
			CallableStatement cs = con.prepareCall("{call OUTPARAMNAME(?,?)}");
			cs.setInt(1, 3); // 入力パラメータの設定
			cs.registerOutParameter(2, java.sql.Types.VARCHAR); // OUTパラメータの型を指定
			cs.execute();

			// OUTパラメータを取得
		    String out = cs.getString(2);
		    System.out.println(out); // 結果: Yuko Oshima
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}