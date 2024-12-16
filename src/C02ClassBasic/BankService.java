package C02ClassBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BankService {
    public static void main(String[] args) {
        Map<String, BankAccount> map = new HashMap<>();
        while (true) {
            System.out.println("서비스번호를 입력하세요");
            System.out.println("1.개설 2.조회 3.입금 4.출금 5.송금");
            Scanner sc = new Scanner(System.in);
            String A = sc.nextLine();
            if (A.equals("1")) {
                System.out.println("계좌번호를입력하세요.");
                String ac = sc.nextLine();
                System.out.println("현재 가지고계신 돈을 입력하세요");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = new BankAccount(ac, money);
                map.put(ac, ba);
            }
            else if (A.equals("2")) {
                System.out.println("계좌조회 서비스입니다. 계좌번호를 입력하세요.");
                String ac = sc.nextLine();
                BankAccount ba = map.get(ac);
                System.out.println("현재 잔고는 "+ba.getBalance());
            }
            else if (A.equals("3")) {
                System.out.println("계좌입금서비스입니다. 계좌번호를 입력하세요.");
                String ac = sc.nextLine();
                System.out.println("입금할 금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = map.get(ac);
                ba.deposit(money);
            }
            else if (A.equals("4")) {
                System.out.println("계좌출금서비스입니다. 계좌번호를 입력해주세요.");
                String ac = sc.nextLine();
                System.out.println("출금금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = map.get(ac);
                ba.withdraw(money);

            }
            else if (A.equals("5")) {
                System.out.println("송금서비스입니다. 내 계좌번호를 입력해주세요.");
                String ac = sc.nextLine();
                System.out.println("상대계좌번호를 입력해주세요.");
                String uac = sc.nextLine();
                System.out.println("송금금액을 입력해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = map.get(ac);
                BankAccount ba2 = map.get(uac);
                ba.transfer(ba, ba2, money);
            }
            else{
                System.out.println("잘못입력하셨습니다");
            }
        }
    }
}

        //        프로그램은 항상 실행될수 있도록 전체코드를 while(true) 처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.개설 : 계좌번호와 현재 가지고계신 돈을 입력하세요.

//        2.조회 : 계좌조회 서비스입니다. 계좌번호를 입력하세요. -> 잔고출력

//        3.입금 : 계좌입금서비스입니다. 계좌번호를 입력하세요.

//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.

//        5.송금 : 송금서비스입니다. 내 계좌번호, 상대계좌번호와 송금금액을 입력해주세요.

    class BankAccount {
        static int static_id;
        private int id;
        private String accountNumber;
        private int balance;

        public BankAccount(String accountNumber, int balance) {
            static_id++;
            this.id = static_id;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void transfer(BankAccount mine, BankAccount yours, int money) {
            if(!this.withdraw(money)){
                return;
            }
            yours.deposit(money);
        }

        public void deposit(int money) {
            this.balance += money;
        }
        public boolean withdraw(int money) {
            if(this.balance < money){
                System.out.println("잔액부족입니다");
                return false;
            }else {
                this.balance -= money;
                return true;
            }
        }









        public int getId() {
            return id;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public int getBalance() {
            return balance;
        }
    }
