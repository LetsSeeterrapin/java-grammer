package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass p1 = new C0304ProtectedClass();
//        public변수 접근가능
        System.out.println(p1.st_pu);
//        protected변수 접근가능
        System.out.println(p1.st_pro);
        System.out.println(p1.st_de);
//        private변수는 캍은 클래스내에서만 접근가능(여기선불가능)
//        System.out.println(p1.st_pri);
    }
}
