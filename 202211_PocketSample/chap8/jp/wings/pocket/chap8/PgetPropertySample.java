package jp.wings.pocket.chap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PgetPropertySample {

	public static void main(String[] args) {
		try (	// プロパティファイルの指定
				InputStream inputStream = new FileInputStream(new File("db.properties"));) {
			Properties configuration = new Properties();
			// ストリームから読み込む
			configuration.load(inputStream);

			System.out.println("host: " + configuration.getProperty("host", "localhost"));
			// keyがない場合は、デフォルトの値が返る
			System.out.println("db: " + configuration.getProperty("DBName"));
		} catch (IOException e) {
		    System.out.println("ファイル読取エラー ;"+e.getMessage());
		}
	}
}
