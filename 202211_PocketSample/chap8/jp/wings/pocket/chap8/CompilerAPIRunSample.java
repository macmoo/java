package jp.wings.pocket.chap8;

import java.io.File;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class CompilerAPIRunSample {
	public static void main(String[] args) throws ClassNotFoundException {

		// JavaCompilerインスタンスを取得す
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		if(compiler != null) {
			// ソースファイルの指定
			File f = new File("src/jp/wings/pocket/chap8/CompilerAPISample.java");
			File b = new File("bin");

			String[] args2 = { "-d",b.getAbsolutePath(),f.getAbsolutePath() };
			// コンパイル
			System.out.println("戻り値：" + compiler.run(null, null, null, args2));

			// コンパイルしたクラスの生成
			Class<?> test = Class.forName("jp.wings.pocket.chap8.CompilerAPISample");
			// メソッドの一覧
			for ( Method m : test.getMethods() ) {
				System.out.println(m.getName());
			}
		}
	}
}