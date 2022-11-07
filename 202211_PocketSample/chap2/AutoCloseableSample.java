package jp.wings.pocket.chap2;

class AutoCloseableSample implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close処理");
		throw new Exception("closeの例外");
	}

	public void test() throws Exception {
		System.out.println("test");
		throw new Exception("testの例外");
	}

	public static void main(String[] args) {

		System.out.println("従来");

		AutoCloseableSample twr = null;
		try {
			twr = new AutoCloseableSample();
			twr.test();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (twr != null) {
				try {
					twr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("try-with-resources");
		try ( AutoCloseableSample twr2 = new AutoCloseableSample())
		{
			twr2.test();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}