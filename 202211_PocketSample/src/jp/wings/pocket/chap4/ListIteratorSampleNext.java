package jp.wings.pocket.chap4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorSampleNext {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random(); // リストの値をランダムに生成
		for(int i = 0; i < 5; i++){
		    list.add(random.nextInt(5));
		}
	    System.out.println(list);

		ListIterator<Integer> iterator = list.listIterator();
		while(iterator.hasNext()){
		    System.out.print("[" + iterator.nextIndex()+ "]→"+iterator.next()+" ");
		}
		System.out.println();
		while(iterator.hasPrevious()){
		    System.out.print("[" + iterator.previousIndex()+ "]→"+iterator.previous()+" ");
		}

	}

}
