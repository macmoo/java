package jp.wings.pocket.chap3;

public class EqualsSample implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException{

		EqualsSample org = new EqualsSample();

		EqualsSample obj1 = (EqualsSample)org.clone();
		EqualsSample obj2 = org;

        System.out.println( org.equals(obj1) );
        System.out.println( org.equals(obj2) );

	}
}
