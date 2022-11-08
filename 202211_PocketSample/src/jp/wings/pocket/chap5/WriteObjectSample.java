package jp.wings.pocket.chap5;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObjectSample {
	public static void main(String[] args) {
		class PrintMessage implements Serializable {
			private static final long serialVersionUID = 1L;
			public void doPrint(String name) {
				System.out.println(name + "さんこんにちは。");
			}
		}
		try {
			String fn = "chap5/data/obTemp.txt";
			// obTemp.txtにPrintMessageオブジェクトを保存する 
			try (FileOutputStream o = new FileOutputStream(fn);
				 ObjectOutputStream oObj = new ObjectOutputStream(o)) {
				oObj.writeObject((Object) (new PrintMessage()));
			}
			try (FileInputStream i = new FileInputStream(fn);
  				 ObjectInputStream iObj = new ObjectInputStream(i)) {
				PrintMessage pm = (PrintMessage) iObj.readObject();
				// 保存したPrintMessageオブジェクトのdoPrintメソッドを実行 
				pm.doPrint("山田");
			}
		}
		catch (Exception e) {
		}
	}
}