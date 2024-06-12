package day02;

public class Account {

    // 1.필드
    private long balance;
    // 2. 생성자
    public Account(){}
    //3.메소드
    //private 필드를 외부로부터 반환해주는 함수
    public long getBalance(){ //예금 확인 함수
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws 잔고부족예외{
        if(this.balance < money) {
            // 만약에 예금액이 출금액보다 작으면 (잔고 부족)

            throw new 잔고부족예외("잔고가 부족해");
        }
        this.balance -= money;
    }

    public static void main(String[] args) {
        Account sinhan = new Account();
        sinhan.deposit(10000);
        System.out.println(sinhan.getBalance());
        try{
            sinhan.withdraw(20000);
        }catch (잔고부족예외 e){
            System.out.println(e.getMessage());
        }
    }
}
