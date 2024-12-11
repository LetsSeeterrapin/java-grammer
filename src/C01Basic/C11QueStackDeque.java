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
////        System.out.println(myQue.poll());
////        System.out.println(myQue);
//////        myQue에 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
////        System.out.println(myQue.peek());
////
//////        우선 순위큐 : 데이터를 꺼낼때 정렬된 데이터 poll
//////        전체 정렬이 아닌, poll할때마다 최소값을 보장
////        Queue<Integer>pq =new PriorityQueue<Integer>();
////        pq.add(30);
////        pq.add(20);
////        pq.add(10);
////        pq.add(40);
////        pq.add(50);
////        System.out.println(pq);
////        while (!pq.isEmpty()) {
////            System.out.println(pq.poll());
////        }
//
////        백준 - 최소힙
////
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        Queue<Integer> pq = new PriorityQueue<>();
////        int count = Integer.parseInt(br.readLine());
////        if()
////
//////        백준 - 최대힙
////        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
////        maxPq.add(30);
////        maxPq.add(10);
////        maxPq.add(20);
////        System.out.println(maxPq.poll());
////
////
////
////        프로그래머스 - 더 맵게
//        Queue<Integer> pq = new PriorityQueue<>();
//        int[] scovill = {1,2,3,9,10,12};
//        int K = 7;
//
//        for (int s : scovill) {
//            pq.add(s);
//        }
//        int answer = 0;
//        while(pq.peek() < K){
//            if(pq.size() <= 1){
//                answer=-1;
//                break;
//            }
//            int temp1 = pq.poll();
//            int temp2 = pq.poll();
//            pq.add(temp1 + temp2*2);
//            answer ++;
//        }
//        System.out.println(answer);
////
////        stack
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(30);
//        st.push(20);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//
//        while (!st.isEmpty()) {
//            System.out.println(st.pop());
//        }
//
////        같은 숫자는 싫어
//        int[] arr ={1,1,3,3,0,1,1};
//        Stack<Integer> s = new Stack<>();
//        for(int a : arr){
//           if(s.isEmpty()){ s.push(a);}
//           else{
//               if(s.peek() != a){
//                   s.push(a);
//               }
//           }
//        }
//        int[] answer = new int[s.size()];
//        for(int i=answer.length-1;i>=0;i--){
//            answer[i]= s.pop();
//        }
//        System.out.println(Arrays.toString(answer));
//
//////        다른 풀이 (미완)
////        int count = 0;
////        int[] answer2 = new int[arr.length];
////        for(int i=0;i<answer2.length-1;i++){
////            if(arr[i])
////        }
//
////        Deque : addFirst, addLast, pollFirst, pollLast
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        System.out.println(d1);
//        d1.addFirst(30);
//        System.out.println(d1);
//        System.out.println(d1.peekFirst());
//        System.out.println(d1.peekLast());
//        System.out.println(d1.pollLast());
//        System.out.println(d1.pollFirst());
//
//////        올바른 괄호
////
////        String s = ")()(";
////        Deque<Character> queue = new ArrayDeque<>();
////        for(int i=0; i<s.length(); i++){
////            if(queue.isEmpty()){
////                queue.addLast(s.charAt(i));
////            }else{
////                if(queue.peekLast() == '(' && s.charAt(i) == ')'){
////                    queue.pollLast();
////                }else
////            }
////        }
//
//
//
//
//
//
//
//
    }
}