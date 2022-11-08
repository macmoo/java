package jp.wings.pocket.chap3;

class GetCauseSample {
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
			Throwable th = e.getCause();
			// 原因のスタックトレース
			th.printStackTrace();
		}
	}
}
