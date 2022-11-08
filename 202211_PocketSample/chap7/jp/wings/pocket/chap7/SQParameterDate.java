package jp.wings.pocket.chap7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;

public class SQParameterDate {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				Statement st = con.createStatement();
				PreparedStatement pst = con.prepareStatement("UPDATE user_list SET gdate = ?");) {

			// 現在時刻
			Calendar cal = Calendar.getInstance();
			pst.setDate(1, new Date(cal.getTimeInMillis()), cal);
			System.out.printf("レコード更新(setDate): %d \n",pst.executeUpdate());

			ResultSet rs = st.executeQuery("SELECT * FROM user_list");
			while(rs.next()){
				System.out.println(rs.getInt("id") + " " + rs.getString("gdate"));
			}

			// 5日前に設定
			cal.add(Calendar.DATE, -5);
			// 日付、時刻の設定
			pst.setTimestamp(1, new Timestamp(cal.getTimeInMillis()), cal);
			System.out.printf("レコード更新(setTimestamp): %d\n",pst.executeUpdate());

			rs = st.executeQuery("SELECT * FROM user_list");
			while(rs.next()){
				System.out.println(rs.getInt("id") + " " + rs.getString("gdate"));
			}
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}