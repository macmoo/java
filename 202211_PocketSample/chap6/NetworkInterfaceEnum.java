package jp.wings.pocket.chap6;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceEnum {

	public static void main(String[] args) {

		try {
			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

			while(interfaces.hasMoreElements()) {
				NetworkInterface v = interfaces.nextElement();
	
				System.out.println(v.getDisplayName());
			}
		}
		catch (SocketException ex) {
			ex.printStackTrace();
		}
	}

}
