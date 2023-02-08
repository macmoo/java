package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Study_Stream {
    public static void main(String[] args) {
        List<String> list = List.of("apple","banana","grape","strawberry");
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
        var count = (int) list.stream()                     // Stream 소스
                              .filter(s->s.length() > 5)    // 중간처리(값을 조작)
                              .count();                     // 끝처리 (값을 정리)
        System.out.println("count:" + count);
        // 람다식 : 뽑아낸 값을 사용하기 위한 변수 -> 처리
        System.out.println("----- [06] ------------------------------");
        var s1 = list.stream().collect(Collectors.joining());
        var s2 = list.stream().collect(Collectors.joining("/"));
        var s3 = list.stream().collect(Collectors.toList());
        var s4 = list.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
        System.out.println("----- [07] ------------------------------");
        // ForEach
        list.stream().forEach(s->System.out.println(s));
        System.out.println("/////////////////////////");
        list.forEach(s->System.out.println(s));
        System.out.println("----- [08] ------------------------------");
        // 필터할 경우에는 filter()
        // 값을 가공하는 경우에는 map()
        var s5 = list.stream().map(s->s.toUpperCase()).toList();
        System.out.println("s5:"+s5);
        System.out.println("----- [09] ------------------------------");
        list.stream().skip(1).forEach(s->System.out.println(s));
        System.out.println("/////////////////////////");
        list.stream().skip(1).limit(2).forEach(s->System.out.println(s));
        System.out.println("----- [10] ------------------------------");
        var list2 = List.of("AA","BB","DD","CC","EE","BB");
        list2.stream().sorted().forEach(s->System.out.println(s));
        System.out.println("/////////////////////////");
        list2.stream().distinct().forEach(s->System.out.println(s));
        System.out.println("-----------------------------------------");
    }
}
// ----- [01] ------------------------------
// 00:banana
// 00:strawberry
// 01:banana
// 01:strawberry
// ----- [02] ------------------------------
// 2
// ----- [03] ------------------------------
// true
// false
// true
// true
// ----- [04] ------------------------------
// apple
// banana
// grape
// strawberry
// apple
// banana
// grape
// strawberry
// ----- [05] ------------------------------
// count:2
// ----- [06] ------------------------------
// s1:applebananagrapestrawberry
// s2:apple/banana/grape/strawberry
// s3:[apple, banana, grape, strawberry]
// s4:[apple, banana, grape, strawberry]
// ----- [07] ------------------------------
// apple
// banana
// grape
// strawberry
// /////////////////////////
// apple
// banana
// grape
// strawberry
// ----- [08] ------------------------------
// s5:[APPLE, BANANA, GRAPE, STRAWBERRY]
// ----- [09] ------------------------------
// banana
// grape
// strawberry
// /////////////////////////
// banana
// grape
// ----- [10] ------------------------------
// AA
// BB
// BB
// CC
// DD
// EE
// /////////////////////////
// AA
// BB
// DD
// CC
// EE
// -----------------------------------------
