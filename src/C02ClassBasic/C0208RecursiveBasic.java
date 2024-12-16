//package C02ClassBasic;
//
//public class C0208RecursiveBasic {
//    public static void main(String[] args) {
////        for문으로 1~10까지 누적합계
//        int total = 0;
//        for (int i = 1; i <= 10; i++) {
//            total += i;
//        }
//        System.out.println(total);
////        재귀함수로 1~10까지 누적합계
//        System.out.println(sumAcc(10));
//        System.out.println(factorial(20));
//
////        factorial값 구하기 : 1~n까지의 숫자를 모두 곱한값
////        factorial(5) -> 1*2*3*4*5
//        System.out.println(factorial(20));
//        System.out.println(nachi(100));
//        System.out.println(fibonacci());
//
//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 0; i <= n; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        System.out.println(arr);
//        //        피보나치 수열 구현 : 100번째
////        1 1 2 3 5 8 13 21 34 ...
//        }
//    }
////        피보나치 재귀함수 구현
//    public static int fibonacci(int n) {
//        if(n<=2){
//            return 1;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }
//
//
//    public static long factorial(long n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * (factorial(n - 1));
//    }
//
//
//    //        피보나치 수열 구현 : 100번째
////        1 1 2 3 5 8 13 21 34 ...
//    public static long nachi(long n) {
//
//    }
//
//
//    public static int sumAcc(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumAcc(n - 1);
//
//    }
//}
