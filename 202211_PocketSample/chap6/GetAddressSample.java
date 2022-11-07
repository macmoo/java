package jp.wings.pocket.chap6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAddressSample {
	public static void main(String[] args) {
		try {
			InetAddress host = InetAddress.getByName("localhost");

			for ( byte  b : host.getAddress() ) {
				System.out.println(b);
			}
		}
		catch(UnknownHostException e) {
			System.out.println("Not found ");
		}
	}
}
