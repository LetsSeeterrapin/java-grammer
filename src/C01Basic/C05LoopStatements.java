//package C01Basic;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class C05LoopStatements {
//    public static void main(String[] args) throws IOException {
//        int a = 0;
//        while(a<10){
//            System.out.println("hello world");
//            a=a+1;
//        }
//
////        2~10까지 출력하는 while문 예제
//        int b = 2;
//        while(b<=10){
//            System.out.println(b);
//            b+=1;
//        }
//
////        입력한 숫자의 구구단 단수 출력
//        while (true){
//            System.out.println("단수를 입력해주세요");
//            Scanner sc = new Scanner(System.in);
//            int c = sc.nextInt();
//            int d = 1;
//            while(d<10 && c<=9){
//            System.out.println(c+" X "+d+" = "+c*d);
//            d+=1;
//            }
//        }
//
////        도어락키예제 -> 무한반복되는 도어락키 예제
//
//        int a=0;
//        while (a<5) {
//            System.out.println();
//            System.out.println("비번입력");
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input){
//            System.out.println("문이열렸습니다");
//            break;
//        }else {
//            System.out.println("비밀번호가틀렸습니다");
//            }
//            a++;
//            }
//
//        int a=0;
//        while (a<5) {
//            System.out.println();
//            System.out.println("비번입력");
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if(answer == input){
//                System.out.println("문이열렸습니다");
//                break;
//            }else {
//                System.out.println("비밀번호가틀렸습니다");
//            }
//            a++;
//            if(a==5){
//                System.out.println("5회이상 초과");
//                break;
//
//                }
//            }
//
////        do while문 : 무조건 한번은 실행되는 while문
//        int a = 1;
//        do{
//            System.out.println(a);
//        }
//        while(a<10);
//
////        for문 : 초기식, 조건식, 증감식이 모두 포함되어있는 반복문
//        int b = 2;
//        while(b<=10){
//            System.out.println(b);
//            b++;
//        }
//        for(int a=2; a<11; a++){
//            System.out.println(a);
//        }
////      for문은 사용했던 변수명을 for문 끝난이후 다음라인에서 재선언이 가능
//
////        1~10중에 홀수만 출력하기
//
//        for(int b=1; b<11; b++) {
//            if(b%2!=0){
//                System.out.println(b);
//            }
//        }
////        1~20까지 수중에 짝수를 모두더한값
//        int total = 0;
//        for(int a=1; a<21; a++) {
//            if (a % 2 == 0) {
//                total += a;
//            }
//        }
//        System.out.println(total);
//
////        두 수의 최대 공약수찾기
//        int a = 24;
//        int b = 36;
//        for(int c=1; c<=b; c++){
//            if(a%c==0){
//                System.out.println(c);
//            }
//            else if(b%c==0){
//                System.out.println(c);
//            }
//        }
//
//        int a=24;
//        int b=36;
//        int min = a < b ? a : b;
//        int answer =0;
//        for(int i =1; i<=min; i++){
//            if(a%i ==0 && b%i ==0){
//                answer = i;
//            }
//        }
//        System.out.println(answer);
//
////        소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는수
////        1~24까지 수 중에서 소수인 수를 출력
////        1,2,3,5,7,11,13,17,19,23,29,31,37,41
////        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean answer = false;
//        for(int i = 2; i*i<=n; i++){
//            if(n%i==0){
//                answer = true;
//                break;
//            }
//        }
//        if(answer==true){
//            System.out.println("소수가아닙니다");
//        }else{
//            System.out.println("소수입니다");
//        }
//
////        continue : 반복문의 조건식으로 이동
////          continue를 활용하여 홀수만 출력하기
//        for(int i=1; i<11; i++){
//            if(i%2 ==0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
////        배열과 enhanced for문(향산된 for문-for each문)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
////        일반 for문으로 배열접근
//        for(int i=0; i<4; i++){
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문으로 배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 개수만큼 반복횟수가결정
//        for(int a : arr){
//            System.out.println(a);
//        }
//
////        일반 for문을 통해 arr의 저장된 값 변경
//        for(int i=0; i<4; i++){
//            arr[i] += 10;
//        }
//        System.out.println(arr);
////        향상된 for문을 arr값 변경 시도
//        for(int a : arr){
//            a += 100;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        자바 변수의 유료범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num=20;
//        }
////        abc=30; // if문 중괄호 밖에서는 abc변수의 존재를 모름
//        System.out.println(num);
//
////        다중 반복문
////        2~9단까지 출력
//            for(int i=2; i<10; i++){
//                for(int j=0; j<10; j++){
//                    System.out.println("hello world");
//                }
//                System.out.println(i+"단 입니다");
//            }
//
////            라벨문 : 반복문에 이름을 붙이는 것.
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.println("hello world");
//                if(j==2){
//                    break;
//                }
//            }
//        }
//
//        int[][] arr = {{1,2,3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
////        숫자 8을 찾아서 2,1에 있다고 출력
////        숫자 11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력
//        for(int i=0; i<4; i++){
//            for(int j=0; j<3; j++){
//                if(arr[i][j] == 8){
//                    System.out.println(i+" , "+j+"에 있습니다");
//                }
//            }
//        }
//        boolean end = false;
//        loop1:
//        for(int i=0; i<4; i++){
//            loop2:
//            for(int j=0; j<3; j++){
//                if(arr[i][j] == 11){
//                    System.out.println(i+" , "+j);
//                    end = true;
//                    break loop1;
//                }
//                if(end) break;
//            }
//        }
//            100~200까지 수중에서 가장 작은 소수를 출력
//
//        for(int i=100; i<201; i++){
//            boolean end = false;
//            for(int j=2; j<i; j++){
//                if(i%j==0){
//                    end = true;
//                    break;
//                }
//            }
//                if(!end){
//                    System.out.println(i);
//                    break;
//
//            }
//        }
//        }
//    }
//
