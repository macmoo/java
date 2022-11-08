package jp.wings.pocket.chap5;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObjectSample {

	public static void main(String[] args) {
		try {
			File f = new File("chap5/data/obTemp.txt");
			try (// Stringオブジェクトの書き込み
				ObjectOutputStream op = 
					new ObjectOutputStream(new FileOutputStream(f))) {
				op.writeObject("The answer is blowin' in the wind.");
			}

			// Stringオブジェクトの読み込み
			try (ObjectInputStream oi = 
					new ObjectInputStream(new FileInputStream(f))) {
				System.out.println((String) oi.readObject());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}