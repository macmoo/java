package jp.wings.pocket.chap6;

import java.net.InetAddress;

public class IsReachableSample {
	public static void main(String[] args) {
		try {
			InetAddress host = InetAddress.getByName("192.168.0.1");
			long start = System.currentTimeMillis();
			boolean b = host.isReachable(3000);
			long elapse = System.currentTimeMillis() - start;

			// テスト結果とテストに要した時間を表示
			System.out.printf("%b(%dms)", b, elapse);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

