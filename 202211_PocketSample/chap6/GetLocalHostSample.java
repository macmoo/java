package jp.wings.pocket.chap6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHostSample {
	public static void main(String[] args) {

		try {
			InetAddress host = InetAddress.getLocalHost();

			for ( byte  b : host.getAddress() ) {
				System.out.println(b&0xff); // 正の値として表示させる
			}
		}
		catch(UnknownHostException e) {
			System.out.println("Not found ");
		}
	}
}
