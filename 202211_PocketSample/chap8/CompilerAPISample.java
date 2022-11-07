package jp.wings.pocket.chap8;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class CompilerAPISample {
	public void CompilerTest() {
		// JavaCompilerインスタンスを取得す
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if(compiler == null) {
            System.out.println("サポートしていません");
            // Eclispseのプロジェクト設定で、ライブラリにJREを指定していると
            // エラーになる。JDKを指定すること。
            return;
        }
        // 対応しているバージョンを示すSourceVersionを表示
		System.out.println(compiler.getSourceVersions());
	}

	public static void main(String[] args) {
		new CompilerAPISample().CompilerTest();
	}

}
