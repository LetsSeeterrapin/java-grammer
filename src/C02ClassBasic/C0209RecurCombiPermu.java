package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
//        숫자가 1,2,3,4가 있을때
//        myList로 만들수있는 2개짜리 숫자조합을 이중리스트에 담아서 출력
//        1,2,1,3,1,4,2,3,2,4,3,4
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        System.out.println(myList.get(3)+myList.get(2)+myList.get(1) +""+myList.get(0));
//        List<List<Integer>> answer = new ArrayList<>();
//        for (int i = 0; i < myList.size()-1; i++) {
//            for(int j = i+1; j < myList.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                answer.add(temp);
//            }
//        }
//        System.out.println(answer);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i=0; i<myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j=i+1; j<myList.size(); j++) {
//                temp.add(myList.get(j));
//                answer.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(answer);
//
//
//
//
//    }
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();


//        answer = new ArrayList<>();
//        permu(answer, temp, myList, 2, new boolean[myList.size()]);
//        System.out.println(answer);
////        N과 M (15649) : 백준
//
////        로또(6603): 백준
        combi(answer, temp, myList,2, 0);
        System.out.println(answer);
    }

    public static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start) {
        if(temp.size()== count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++) {
            temp.add(myList.get(i));
            combi(answer, temp, myList, count, i+1);
            temp.remove(temp.size()-1);
        }
    }

//    public static void permu(List<List<Integer>> answer, List<Integer> temp,
//                             List<Integer> myList, int count, boolean[] visited) {
//
//        if (temp.size()==count){
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for (int i=0; i<myList.size(); i++) {
//            if(!visited[i]) {
//                visited[i] = true;
//                temp.add(myList.get(i));
//                permu(answer, temp, myList, count, visited);
//                temp.remove(temp.size() - 1);
//                visited[i] = false;
//            }
//        }
//    }
}
//if (temp.size()==count){
//        answer.add(new ArrayList<>(temp));
//        return;
//        }
//        for (int i=start; i<myList.size(); i++) {
//        temp.add(myList.get(i));
//combi(count, i+1);
//            temp.remove(temp.size() - 1);
//        }