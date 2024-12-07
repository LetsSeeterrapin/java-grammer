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
//        배열의 정렬
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

//        K번째수 프로그래머스
        int[] arr = {1, 5, 2, 6, 3, 7, 4};

        int[] answer
        for (int i = arr2[0]; i >= arr2[0] && i <= arr2[1]; i++) {
            int[] arr2 = {2, 5, 3};
            int[] temp = new int[arr2[i][]];

            System.out.println(Arrays.toString(arr));

        }





    }
}