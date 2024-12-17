package C04Interface.BankService;

public class BankCardService implements BankService {

//    입금시
//    xx원 카드로 입금되었습니다.
//    현재 잔액은 yy원입니다.


//    출금
//    xx원 카드로 출금되었습니다.
//    현재 잔액은 yy원입니다.
    @Override
    public void deposit(int money, BankAccount ba) {
        int current = ba.getBalance();
        int balance = current + money;
        ba.updateBalance(balance);
        System.out.println(money+"원이 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 "+ balance+"원 입니다");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int current = ba.getBalance();
        if(current < money) {
            System.out.println("잔액부족입니다");
            return;
        }else{
            int balance = current - money;
            ba.updateBalance(balance);
            System.out.println(money+"원이 카드에서 출금되었습니다.");
            System.out.println("현재 잔액은 "+ balance+"원 입니다");
        }

    }
}
