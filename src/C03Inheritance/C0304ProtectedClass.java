package C03Inheritance;

//class에는 public과 default 접근제어자만 존재
public class C0304ProtectedClass {
//    변수,메서드에는 4가지 접근제어자가 존재
//    public : 프로젝트 전체에서 접근가능 (다른패키지여도 접근가능)
//    protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근 가능
//    default : 패키지내에서만 접근가능
//    private : 클래스내에서만 접근가능
    private String st_pri = "hello java1";
            String st_de = "hello java2";
    protected String st_pro = "hello java3";
    public String st_pu = "hello java4";
}
