package C01Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C10Set {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        System.out.println(mySet);
        for(String a : mySet){
            System.out.println(a);
        }
//        순서보장X,중복제거
//        출력시 indwx로 접근불가
        for(String a : mySet){
            System.out.println(a);
        }

//        폰켓몬 프로그래머스

//        LinkedHashSet
        Set<Integer> hashSet = new HashSet<>(); //정렬 알고리즘을 사용하지안아 성능상으로 좋다
        hashSet.add(1);
        hashSet.add(0);
        hashSet.add(17);
        hashSet.add(3);
        System.out.println(hashSet); // 0,1,17,3 출력(문자열 순서)

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(0);
        linkedSet.add(3);
        linkedSet.add(17);
        System.out.println(linkedSet); // 0,1,17,3 출력(먼저 입력된 순서)

        Set <Integer>TreeSet = new TreeSet<>();
        TreeSet.add(1);
        TreeSet.add(0);
        TreeSet.add(17);
        TreeSet.add(3);
        TreeSet.add(1);
        System.out.println(TreeSet); // 0.1.3.17 출력 (수열 순서)

//        집합관련함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("javascript");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");
//        set1.retainAll(set2);
        set1.addAll(set2);
        System.out.println(set1);



    }
}
