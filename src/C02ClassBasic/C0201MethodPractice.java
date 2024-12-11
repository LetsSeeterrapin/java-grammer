package C02ClassBasic;

import java.util.Scanner;

public class C0201MethodPractice {
    public static void main(String[] args) {

        if(isPrime(13)){
            System.out.println("소수가아닙니다");
        }else{
            System.out.println("소수입니다");
        }
    }
    public static boolean isPrime(int input){
    boolean answer = false;
        for(int i = 2; i*i<=input; i++){
        if(input%i==0){
            answer = true;
            break;}
        }
        return answer;
    }
}
