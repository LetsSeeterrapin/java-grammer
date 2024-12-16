package C03Inheritance.ProtectedPackage;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedTest extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        public변수 접근가능
        System.out.println(c1.st_pu);
////        protected변수 접근불가능 : 상속관계 없을 경우
//        System.out.println(c1.st_pro);
//        System.out.println(c1.st_de);
//        System.out.println(c1.st_pri);

        ProtectedTest p1 = new ProtectedTest();
        System.out.println(p1.st_pro);
//        상속관계에 있다 하더라도 default변수는 접근불가
//        System.out.println(p1.st_de);
    }
}
