package jp.wings.pocket.chap3;

class DumpStackSample extends Thread {

	public void run() {
		System.out.println("スレッド開始");

		System.out.println("- dumpStack -");
		Thread.dumpStack();

		System.out.println("- getStackTrace -");
		for(StackTraceElement s: getStackTrace() )
			System.out.println(s);
	}
	public static void main(String[] arg) {
		// スレッドの生成と開始
		new DumpStackSample().start();
	}

}
