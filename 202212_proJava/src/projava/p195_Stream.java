package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class p195_Stream {
	public static void main(String[] args) {
		List<String> list = List.of("apple","banana","grape");
		// ----------------------------------------------------------------
		var result0 = list.stream().filter(s->s.length()>=6).collect(Collectors.toCollection(ArrayList::new));
		var result1 = list.stream().filter(s->s.length()>=6).collect(Collectors.toList());
		for(String str:result0) System.out.println("00:"+str);
		for(String str:result1) System.out.println("01:"+str);
		// str:banana
		// ----------------------------------------------------------------
		var result2 = (int)list.stream().filter(s->s.length()>=6).count();
		System.out.println("02:"+result2);
		// ----------------------------------------------------------------
		System.out.println("03:"+list.stream().allMatch(s->s.contains("a")));
		System.out.println("04:"+list.stream().allMatch(s->s.contains("b")));
		System.out.println("05:"+list.stream().anyMatch(s->s.contains("b")));
		System.out.println("06:"+list.stream().noneMatch(s->s.contains("z")));
		// ----------------------------------------------------------------
		list.stream().forEach(s->System.out.println(s));
		list.forEach(s->System.out.println(s));
		// ----------------------------------------------------------------
		// ----------------------------------------------------------------
		// ----------------------------------------------------------------
		// ----------------------------------------------------------------
		// ----------------------------------------------------------------
	}
}
