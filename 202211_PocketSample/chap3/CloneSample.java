package jp.wings.pocket.chap3;

public class CloneSample implements Cloneable  {

	StringBuilder str = new StringBuilder();

	public static void main(String[] args)
	                     throws CloneNotSupportedException {

		int[] org = {1, 2};
		int[] cloned = org.clone(); // 配列のクローン

		System.out.println("cloned:"+cloned[0]+cloned[1]);

		CloneSample obj = new CloneSample();

		// 初期文字列設定
		obj.str.append("Original");

		// 参照先がコピーされるだけ
		CloneSample shallow = (CloneSample)obj.clone();

		// 別のインスタンスに文字をコピーする
		CloneSample deep = new CloneSample();
		deep.str.append(obj.str.toString());

		// コピー元を変更
		obj.str.reverse();

		// コピー先も影響を受ける
		System.out.println("shallow:"+shallow.str.toString());
		// コピー時のまま
		System.out.println("deep:"+deep.str.toString());

	}
}
