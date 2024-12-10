package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////        배열 표현식1. 리터럴 방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr - new String [5];
//         stArr[0] = "0";
//         stArr[0] = "0";
//         stArr[2] = "0";
////         아래코드는nullpointExeption발생
//        for(int i = 0; i < stArr.length; i++);
//
//
////        표현식3
//        int[] intArr3 = new int[]{1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});
//
////        표현식4 : 불가 -> 배열의 길이가 사전지정되어야함
//        int[] intArr4 = new int[];
//
//        String[] stArr = new String[5];
//        for(int i=0; i<=stArr.length; i++){
//            stArr[i] = ""+i;
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

//        85,65,90 인 int 배열을 선언하고, 총합, 평균을 구하자.
//        int[] Arr2 = {80,65,90};
//        int total = 0;
//        for(int i=0; i<=Arr2.length; i++){
//            total += Arr2[i];
//        }
//        System.out.println(total);
//        System.out.println((double)total/Arr2.length);
//
////        배열의 최대값, 최소값
//        int[] arr3 = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr3.length; i++){
//            if(arr3[i] > max){
//                max = arr3[i];
//            }
//            if(arr3[i] < min){
//                min = arr3[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
////            배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10,20,30,40,50};
//        int temp =arr2[0];
//        arr2[0] =arr2[1];
//        arr2[1] =temp;
//
//        temp =arr2[1];
//        arr2[1] =arr2[2];
//        arr2[2] =temp;
//
//        temp =arr2[2];
//        arr2[2] =arr2[3];
//        arr2[3] =temp;
//
//        temp =arr2[3];
//        arr2[3] =arr2[4];
//        arr2[4] =temp;
//        System.out.println(Arrays.toString(arr2));
//
//        for(int i=0;i<arr2.length-1;i++){
//            int temp=arr2[i];
//            arr2[i]=arr2[i+1];
//            arr2[i+1]=temp;
//        }
//        System.out.println(Arrays.toString(arr2));
//
////        배열뒤집기 : 새로운배열을 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            newArr[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
////        배열의 정렬
//        int[] arr = {17,12,20,10,25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
////        선택정렬 알고리즘 구현
//        int[] arr = {17,12,20,10,25}; // 공약수들로 찾을수있을까
//
//        for(int i=0;i<arr.length-1;i++){
//                int min=Integer.MAX_VALUE;
//                int minIndex=i;
//            for(int j=i+1;j<=arr.length-1;j++){
//               if(min>arr[j]){
//                   min=arr[j];
//                   minIndex=j;
//               }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        문자정렬
////        아스코드(unicode)기준으로 정렬
//        String[] fruits = {"Banana", "Apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple", "applee", "applef", "b"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
////        내림차순 : 기본형 타입은 Comparator 처리불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        int[] arr = {5,1,2,3,6};
////        Integer[] arr2 = new Integer[arr.length];
//        Arrays.sort(arr);
//
////        K번째수 프로그래머스
//        int[] arr = {1, 5, 2, 6, 3, 7, 4};
//        int[] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[arr2.length];
//        for (int i = arr2[0]; i >= arr2[0] && i <= arr2[1]; i++) {
//            int[] temp = new int[arr2[i][1]]-arr2[i][0]+1;
//
//            System.out.println(Arrays.toString(arr));
//
//        }

//        숫자조합의 합
////        모두 각기다른 숫자의 배열이 있을때, 만들어질수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        int[] arr1 = new int[intArr.length * intArr.length];
//        int index=0;
//        for(int i = 0; i < intArr.length; i++ ){
//            for(int j=i+1; j < intArr.length; j++){
//                arr1[index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = new int[index];
//        for(int i = 0; i < index; i++) {
//            arr2[i] = arr1[i];
//        }
//        Arrays.sort(arr2);  //정렬
//        System.out.println(Arrays.toString(arr2));
//// 중복제거
//        int[] arr3 = new int[arr2.length];
//        int count = 0;
//        for(int i = 0; i < arr2.length; i++) {
//            if(i==arr2.length-1 || arr2[i] != arr2[i+1]){
//                arr3[count] = arr2[i];
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(arr3));
//
////      배열의 복사
////        Arrays.copyOf(배열명, length), copyOfRange(배열명, start, end)
//            int[] answer1 = Arrays.copyOf(arr3. count);
//            int[] answer2 = Arrays.copyOfRange(arr3,0, count);
//
////            두 개 뽑아서 더하기 - 프로그래머스
//        int[] intArr = {2,1,3,4,1};
//        int[] arr1 = new int[intArr.length * intArr.length];
//        int index = 0;
//        for(int i=0;i<intArr.length;i++){
//            for(int j=i+1;j<intArr.length;j++){
//            arr1[index] = intArr[i]+intArr[j];
//            index++;
//            }
//        }
//        int[] arr2 = new int[index];
//        for(int i = 0; i < index; i++) {
//            arr2[i] = arr1[i];
//        }
//        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1);
//        int[] arr3 = new int[arr1.length];
//        int count = 0;
//        for(int i=0;i<arr1.length;i++){
//            if(i == arr1.length-1 || arr1[i] != arr1[i+1]){
//                arr3[count] = arr1[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr3));
////        배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int target = 8;
//
//
//
////      이진검색(binary search) - 이분탐색
////        사전에 오름차순정렬이 되어있어야 이진 검색 가능
//        int[] arr = {1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr, 15));
//
////        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));
//
////        2차원 배열의 선언과 할당
//        int[][] arr1 = new int [2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[0][2] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//        int[][] arr2 = {{10,20,30}, {40,50,60}};
//
////        가변배열 선언 후 할당.
//        int[][] arr1 = new int[2][];
//        arr1[0] = new int[2];
//        arr1[1] = new int[3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[1][0] = 30;
//        arr1[1][1] = 40;
////        arr1[1][2] = 50;
//        System.out.println(Arrays.deepToString(arr1));
////        가변배열 리터럴 방식
//        int [][]arr2 = {{10,20}, {30,40,50}};

//        [3][4] 사이즈 배열 선언하고
//        1~12까지 숫자값을 각 배열네 순차적으로 할당
//        {1,2,3,4}{5,6,7,8}.....
//        int[][] arr = new int[3][];
//        int num = 1;
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = new int[4];
//            for(int j = 0; j<arr[i].length; j++){
//                arr[i][j] = num;
//                num++;
//            }
//        }
//        행렬의 덧셈 프로그래머스
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 2;
        arr1[1][1] = 3;
        arr2[0][0] = 3;
        arr2[0][1] = 4;
        arr2[1][0] = 5;
        arr2[1][1] = 6;
        int[][] answer = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(answer));


    }
}