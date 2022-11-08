package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.DriverManager;

public class TRSetGetTransactionSample {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger")	) {

			// 現在のトランザクションレベルを取得
			int  level = con.getTransactionIsolation();

			// どのトランザクション分離レベルかを判定する
			System.out.println(level == Connection.TRANSACTION_READ_COMMITTED );
			System.out.println(level == Connection.TRANSACTION_READ_UNCOMMITTED);
			System.out.println(level == Connection.TRANSACTION_REPEATABLE_READ);
			System.out.println(level == Connection.TRANSACTION_SERIALIZABLE );

		} catch (Exception e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
