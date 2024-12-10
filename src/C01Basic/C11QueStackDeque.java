package C01Basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<Integer>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        myQue에 데이터를 삭제하면서 반환
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
////        myQue에 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
//        System.out.println(myQue.peek());
//
////        우선 순위큐 : 데이터를 꺼낼때 저렬된 데이터 poll
////        전체 정렬이 아닌, poll할때마다 최소값을 보장
//        Queue<Integer>pq =new PriorityQueue<Integer>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

//        백준 - 최소힙
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Queue<Integer> pq = new PriorityQueue<>();
//        int count = Integer.parseInt(br.readLine());
//        if()

//        백준 - 최대힙
        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        maxPq.add(30);
        maxPq.add(10);
        maxPq.add(20);
        System.out.println(maxPq.poll());

//


    }
}
