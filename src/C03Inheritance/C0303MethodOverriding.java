package C03Inheritance;
//중요
public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.sound2();
//        상속관계일 때 부모클래스의 타입을 자식클래스객체의 타입으로 지정가능
//        animal클래스에 정의 된 메서드만 사용가능하도록 타입의 제약발생
        Animal d2 = new Dog();
        d2.sound();
    }
}



class Animal {
    void sound(){
        System.out.println("동물이 소리를 냅니다");
    }
}




class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("멍멍");
    }
    void sound2(){
        System.out.println("멍멍멍");
    }
}




class Cat extends Animal {

}