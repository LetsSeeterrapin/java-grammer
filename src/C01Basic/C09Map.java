package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
////        map은 index요소가 없으므로 순서가 무의미
////        key값은 중복되지 않고, 만약에 동일한 key값으로 다른 value를 넣으면 value를 덮어쓰기함
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이"); // 덮어쓰기
//        System.out.println(sports);
//
//
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 복잡도는0(1)
//        System.out.println(sports.get("baseball"));
//
////        map의 전체데이터 조회
////        keySet() : map의 key목록을 리턴하는 메서드
////        values() : map의 value목록을 리턴하는 메서드
//        for(String key : sports.keySet()) {
//            System.out.println(key);
//            System.out.println(sports.get(key));
//        }
//
////        remove : 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer","운동");
//        sports.putIfAbsent("baseball","야구");
//        System.out.println(sports);
//
////        getOrDefault : key가 없으면 default값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("pingpong", "그런키없음"));
//        System.out.println(sports.getOrDefault("baseball", "그런키없음"));
//
////        containsKey : 키가있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));

////        농구:2, 축구:2, 야구:1
//        String[] arr = {"농구", "축구", "농구", "야구", "축구","축구","축구"};
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a : arr) {
//            if(myMap.containsKey(a)) {
//                myMap.put(a, myMap.get(a) + 1);
//            }else{
//                myMap.put(a, 1);
//            }
//        }
//        System.out.println(myMap);
//
//        for(String a : arr) {
//            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
//        }
//        System.out.println(myMap);
//
////        완주하지 못한 선수
////        ["leo", "kiki", "eden"]	["eden", "kiki"]
////        ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
//        String[] arr ={"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] arr2 ={"josipa", "filipa", "marina", "nikola"};
//        Map<String, String> runner = new HashMap<>();
//        Map<String, String> comp = new HashMap<>();
//        for(String key : arr) {
//            runner.put(key, "참가자");
//        }
//        for(String makey : arr2) {
//            comp.put(makey, "완주자");
//        }
//        System.out.println(comp);


//        treemap
//          Hash맵을 사용해서 key으로 정렬
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("hello5", 1);
        myMap.put("hello4", 2);
        myMap.put("hello3", 3);
        myMap.put("hello2", 4);
        myMap.put("hello1", 5);
        List<String> myList = new ArrayList<>();
        for(String a : myMap.keySet()) {
            myList.add(a);
        }
        Collections.sort(myList);
        for (String l : myList) {
            System.out.println("key 값은"+l);
            System.out.println("value값은"+ myMap.get(l));
        }
        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(myList);

////        hashmap출력방법 2가지 : 1. 강화된 for문 2. iterator
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        for(String a : myMap.keySet()) {
//            System.out.println(a);
//        }

//        next메서드는 데이터를 하나씩 소모시키면서 값을 반환






    }
}