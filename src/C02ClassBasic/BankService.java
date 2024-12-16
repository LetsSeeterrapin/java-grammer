package C02ClassBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BankService {
    public static void main(String[] args) {
        Map<String, BankAccount> map = new HashMap<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("서비스번호를 입력하세요(1.개설 2.조회 3.입금 4.출금 5.송금)");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("계좌개설 입니다. 계좌번호를 입력해주세요.");
                String ac = scanner.nextLine();
                System.out.println("금액을 입력해주세요.");
                int money = Integer.parseInt(scanner.nextLine());
                BankAccount ba = new BankAccount(ac, money);
                map.put(ac, ba);

            } else if (input.equals("2")) {
                System.out.println("계좌조회 입니다. 계좌번호를 입력하세요");
                String ac = scanner.nextLine();
                BankAccount ba = map.get(ac);
                System.out.println("현재잔고는 "+ ba.getBalance()+"입니다.");

            } else if (input.equals("3")) {
                System.out.println("입금입니다. 계좌번호를 입력해주세요.");
                String ac = scanner.nextLine();
                System.out.println("입금할 금액을 입력해주세요");
                int money = Integer.parseInt(scanner.nextLine());
                BankAccount ba = map.get(ac);
                ba.deposit(money);

            } else if (input.equals("4")) {
                System.out.println("출금입니다. 계좌번호를 입력해주세요");
                String ac = scanner.nextLine();
                System.out.println("출금할 금액을 입력해주세요");
                int money = Integer.parseInt(scanner.nextLine());
                BankAccount ba = map.get(ac);
                ba.withdraw(money);

            } else if (input.equals("5")) {
                System.out.println("송금입니다. 내 계좌번호를 입력해주세요.");
                String ac = scanner.nextLine();
                System.out.println("상대계좌번호를 입력해주세요.");
                String yourac = scanner.nextLine();
                System.out.println("송금금액을 입력해주세요.");
                int money = Integer.parseInt(scanner.nextLine());
                BankAccount ba1 = map.get(ac);
                BankAccount ba2 = map.get(yourac);
                ba1.transfer(ba2, money);

            } else {
                System.out.println("잘못 입력하셨습니다");
            }
        }
//        프로그램은 항상 실행될수 있도록 전체코드를 while(true) 처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.개설 : 계좌번호와 현재 가지고계신 돈을 입력하세요.

//        2.조회 : 계좌조회 서비스입니다. 계좌번호를 입력하세요. -> 잔고출력

//        3.입금 : 계좌입금서비스입니다. 계좌번호를 입력하세요.

//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.

//        5.송금 : 송금서비스입니다. 내 계좌번호, 상대계좌번호와 송금금액을 입력해주세요.
    }
}



// Acccount 객체 : 자체 ID값(자동 increment), 계좌번호, 잔액 변수로 구성
class BankAccount{
    static long static_Id = 0L;
    private long id;
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        static_Id++;
        this.id = static_Id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(int money) {
        this.balance += money;
    }
    public boolean withdraw(int money) {
        if(this.balance >= money){
            this.balance -= money;
            return true;
        }else{
            System.out.println("잔액부족입니다.");
            return false;
        }
    }
    public void transfer(BankAccount bankCount, int money) {
        if(!this.withdraw(money)){
            return; //void가 return을 만나면 강제종료
        }bankCount.deposit(money);
    }






    public long getId() {
        return id;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }




}

