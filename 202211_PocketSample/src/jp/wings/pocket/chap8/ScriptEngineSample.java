package jp.wings.pocket.chap8;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class ScriptEngineSample {
	public static void main(String[] args) {

		// スクリプトエンジンマネージャの生成
		ScriptEngineManager manager = new ScriptEngineManager();

		// スクリプトエンジンファクトリの取得
		for (ScriptEngineFactory f : manager.getEngineFactories() ) {
			// スクリプト言語の名前とバージョン
			System.out.println(f.getLanguageName() + " "+ f.getLanguageVersion());
			// スクリプトエンジンの名前
			// ScriptEngine の識別に使用する
			System.out.println(f.getNames() );
		}
	}
}
