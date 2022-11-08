package jp.wings.pocket.chap5;


import java.io.File;

public class FSGetInfoSpace {
	public static void main(String[] args) {
		File file = new File("chap5/data");

		// 各サイズをギガバイト数で表示する
		System.out.println("パーティションサイズ:" + file.getTotalSpace()/1024/1024/1024f+"(GB)");
		System.out.println("空き領域:" + file.getFreeSpace()/1024/1024/1024f+"(GB)");
		System.out.println("利用可能領域:" + file.getUsableSpace()/1024/1024/1024f+"(GB)");
	}
}
