package jp.wings.pocket.chap2;

class MultiCatchSample {
	public static class Exception1 extends Exception {
	}
	public static class Exception2 extends Exception {
	}

	public static void main(String[] args) {
		int n = 2;
		try {
			switch (n) {
			case 1:
				throw new Exception1();
			case 2:
				throw new Exception2();
			}
		}
		catch (Exception1 | Exception2 e) {	    // マルチキャッチ
			// Exception2の例外ならtrue
			System.out.println(e instanceof Exception2);
		}
	}
}