package jp.wings.pocket.chap3;

import java.util.logging.Level;
import java.util.logging.Logger;

// 各ログレベルのログを出力
public class OutLogSample1{
	public static void main(String[] args){

		// クラス名のロガー作成
		Logger logger = Logger.getLogger(OutLogSample1.class.getName());

		// ログの出力
		logger.warning("WARNINGログの出力");
		logger.log(Level.WARNING, "WARNINGログ出力");

		// デフォルトのハンドラでは出力されない
		logger.config("CONFIGログの出力");
		logger.log(Level.CONFIG, "CONFIGログ出力");

		// リソースバンドルを指定してロガー作成
		Logger logger2 = Logger.getLogger("french","jp.wings.pocket.chap3.LogResource_fr");

		// ログの出力
		logger2.severe("severe");
		logger2.log(Level.SEVERE, "severe");
	}
}
