package jp.wings.pocket.chap3;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

// 各ログレベルのログを出力
public class OutLogSample2{
	public static void main(String[] args){

		// クラス名のロガー作成
		Logger logger = Logger.getLogger(OutLogSample2.class.getName());

		try{
			FileHandler handler = new FileHandler("chap3/sample.log");

			// ファイル出力ハンドラの追加
			logger.addHandler(handler);

			// ハンドラ名の列挙
			for (Handler h : logger.getHandlers() )
				System.out.println("追加ハンドラ: "+h.getClass().getName());

			// ログの出力
			logger.warning("WARNINGログの出力");

			// ハンドラ削除
			logger.removeHandler(handler);
			// 以下はファイルに出力されない
			logger.log(Level.SEVERE, "SEVERログ出力");
		}
		catch(java.io.IOException e){
		}
	}
}
