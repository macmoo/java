package jp.wings.pocket.chap3;

class StackTraceElementSample {
	static void test() throws Exception {
		try {
			throw new InterruptedException();
		}
		catch (Exception e) {
			// 例外の原因（InterruptedException）を
			// 指定してスロー
			throw new Exception("サンプル",e);
		}
	}

	public static void main(String[] args) {

		try {
			test();
		}
		catch (Exception e) {
			for( StackTraceElement el : e.getCause().getStackTrace() )
				System.out.println(el.toString());

			for( StackTraceElement el2 : e.getStackTrace() ) {
				System.out.println("行番号: "+el2.getLineNumber());
				System.out.println("ファイル名: "+el2.getFileName());
				System.out.println("クラス名: "+el2.getClassName());
				System.out.println("メソッド名: "+el2.getMethodName());
			}
		}
	}
}

