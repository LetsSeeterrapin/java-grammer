package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
        System.out.println(MyCalculator.sum(10,20));

//        A부서의 매출
//        20원 매출
        MyCalculator.sumAcc(20);
        System.out.println(MyCalculator.total);
//        30원 매출
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);
//        40원 매출
        MyCalculator.sumAcc(40);
        System.out.println(MyCalculator.total);

//        B부서의 매출
//        10원 매출
        MyCalculator.total = 0;
        MyCalculator.sumAcc(10);
//        20원 매출
        MyCalculator.sumAcc(20);
        System.out.println(MyCalculator.total);

//        객체를 사용한 회계프로그램 : 객체 고유의 메모리 공간 할당
        MyCalculatorInstance m1 = new MyCalculatorInstance();
        MyCalculatorInstance.total_count += 1;
        m1.sumAcc(10);
        m1.sumAcc(20);
        System.out.println(m1.total);
        MyCalculatorInstance m2 = new MyCalculatorInstance();
        MyCalculatorInstance.total_count += 1;
        m2.sumAcc(30);
        m2.sumAcc(40);
        System.out.println(m2.total);

//        이름세팅,eating()메서드 호출
        C0202Person p1 = new C0202Person();
        p1.setName("honggildong");
        p1.setAge(20);
        p1.setEmail("honggildong@gmail.com");
        p1.eating();
        System.out.println(p1.whoIs());

    }
}
class MyCalculator {
//    statix이 붙어있는 변수는 클래스 변수, static이 붙어있지않으면 객체변수

    static int total = 0;

    static int sum(int a, int b) {
        return a+b;
    }
    static void sumAcc(int a){
        total += a;
    }}
    class MyCalculatorInstance {
//    static이 붙어있는 변수는 클래스 변수, static이 붙어있지않으면 객체변수
        static int total_count = 0;

        int total = 0;

        void sumAcc(int a){
//            this는 객체 그 자신을 의미
//            예를들어 m1객체일 경우 m1.total, m2객체일 경울 m2.total
            total += a;
        }
}