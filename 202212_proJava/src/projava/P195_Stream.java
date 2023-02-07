package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P195_Stream {
	public static void main(String[] args) {
		List<String> list = List.of("apple","banana","grape");
		System.out.println("----- [01] ------------------------------");
		var result0 = list.stream().filter(s->s.length()>=6).collect(Collectors.toCollection(ArrayList::new));
		var result1 = list.stream().filter(s->s.length()>=6).collect(Collectors.toList());
		for(String str:result0) System.out.println("00:"+str);
		for(String str:result1) System.out.println("01:"+str);
		// str:banana
		System.out.println("----- [02] ------------------------------");
		var result2 = (int)list.stream().filter(s->s.length()>=6).count();
		System.out.println(result2);
		System.out.println("----- [03] ------------------------------");
		System.out.println(list.stream().allMatch(s->s.contains("a")));
		System.out.println(list.stream().allMatch(s->s.contains("b")));
		System.out.println(list.stream().anyMatch(s->s.contains("b")));
		System.out.println(list.stream().noneMatch(s->s.contains("z")));
		System.out.println("----- [04] ------------------------------");
		list.stream().forEach(s->System.out.println(s));
		list.forEach(s->System.out.println(s));
		System.out.println("----- [05] ------------------------------");
		var count = (int) list.stream()						// Stream 소스
							  .filter(s->s.length() > 5)	// 중간처리(값을 조작)
							  .count();						// 끝처리 (값을 정리)
		System.out.println("count:" + count);
		// 람다식 : 뽑아낸 값을 사용하기 위한 변수 -> 처리
		System.out.println("----- [06] ------------------------------");
		var s1 = list.stream().collect(Collectors.joining());
		var s2 = list.stream().collect(Collectors.joining("/"));
		var s3 = list.stream().collect(Collectors.toList());
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		System.out.println("----- [07] ------------------------------");
		System.out.println("----- [08] ------------------------------");
		System.out.println("----- [09] ------------------------------");
	}
}
