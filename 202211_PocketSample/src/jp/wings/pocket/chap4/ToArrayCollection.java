package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.Collection;

//コレクションを配列として取得し、その内容を表示します。
public class ToArrayCollection{
	public static void main(String[] args){

		Collection<String> col = new ArrayList<>();
		String[] number = {"one", "two", "three"};  //コレクションに格納する配列
		for(String tmp : number){
			col.add(tmp);
		}
		System.out.println("colを配列に変換");
		Object[] objects = col.toArray();
		for(int i = 0; i < objects.length; i++){
			System.out.print(i + "=" + objects[i] + " ");
		}
		System.out.println("\ncolをString配列に変換");
		String[] stary = col.toArray( new String[0] );
		for(int i = 0; i < stary.length; i++){
			System.out.print(i + "=" + stary[i] + " ");
		}
	}
}
