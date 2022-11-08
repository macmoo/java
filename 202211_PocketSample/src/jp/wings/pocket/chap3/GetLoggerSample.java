package jp.wings.pocket.chap3;

import java.util.logging.Logger;

// 各ログレベルのログを出力
public class GetLoggerSample{
	public static void main(String[] args){

		// ロガー作成
		Logger logger1 = Logger.getLogger("sample");
		Logger logger2 = Logger.getLogger("sample");

		// logger1とlogger2は、同じオブジェクト
		System.out.println(logger1.equals(logger2)); // 結果：true
	}
}
