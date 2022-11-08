package jp.wings.pocket.chap8;

import javax.script.ScriptEngine;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineEvalSample {
	public static void main(String[] args) {

		// スクリプトエンジンマネージャの生成
		ScriptEngineManager manager = new ScriptEngineManager();

        // スクリプトエンジンの取得
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        // スクリプトの実行
        try {
			engine.eval("print('Hello, World!');");

        } catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}
