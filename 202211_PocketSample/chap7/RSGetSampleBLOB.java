package jp.wings.pocket.chap7;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RSGetSampleBLOB {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wings_db", "scott", "tiger");
				PreparedStatement ps1 = con.prepareStatement("REPLACE INTO picture_list(id,contents) VALUES(1,?)");
				PreparedStatement ps2 = con.prepareStatement("SELECT contents FROM picture_list WHERE id=?");) {

			File fin = new File("chap7/sky.jpg");
			try(FileInputStream in = new FileInputStream(fin)){

				// BLOB型の列に画像ファイルのデータを書き込む
				ps1.setBinaryStream(1, in,fin.length());
				ps1.executeUpdate();

				// BLOB型の列をselect
				ps2.setInt(1, 1);
				ResultSet rs = ps2.executeQuery();
				rs.next();

				// BLOB型の列をストリームとして読み込む
				BufferedImage img = ImageIO.read( rs.getBinaryStream(1) );
				Icon icon = new ImageIcon(img);
				// 画像をダイアログで表示
				JOptionPane.showMessageDialog(null, "", "", JOptionPane.PLAIN_MESSAGE, icon );
			}
			catch (IOException e) {
			}
		}
		catch (SQLException e) {
		    System.out.println("DB処理エラー" + e.getMessage());
		}
	}
}
