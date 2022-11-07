package jp.wings.pocket.chap6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostNameSample {

	public static void main(String[] args) {

		try {
			InetAddress host = InetAddress.getByName("localhost");
			System.out.println("Host name = " + host.getHostName());
			System.out.println(
					"Canonical Host name = " + host.getCanonicalHostName());

			host = InetAddress.getByName("220.151.20.227");
			System.out.println("Host name = " + host.getHostName());
			System.out.println(
					"Canonical Host name = " + host.getCanonicalHostName());
		}
		catch(UnknownHostException e) {
			System.out.println("Not found ");
		}
	}
}
