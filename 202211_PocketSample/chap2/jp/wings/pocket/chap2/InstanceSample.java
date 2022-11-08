package jp.wings.pocket.chap2;


public class InstanceSample {


	public static void main(String[] args) {

		Triangle triangle1;
		triangle1 = new Triangle();
		Triangle triangle2 = new Triangle();

       System.out.println( triangle1.getArea(1.0f,2.0f) );
       System.out.println( triangle2.getArea(3.0f,4.0f) );


	}
}

