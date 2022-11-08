package jp.wings.pocket.chap6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameSample {
	public static void main(String[] args) {

		try {
			System.out.println(
					InetAddress.getByName("www.google.co.jp") );

			for ( InetAddress n :
				InetAddress.getAllByName("www.google.co.jp") ) {
				System.out.println(n);
			}
		}
		catch(UnknownHostException e) {
			System.out.println("Not found ");
		}
	}
}
