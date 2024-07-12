import java.util.Scanner;

class BankAccounts{
    void deposit(long amnt){
        System.out.println("Deposit amount"+amnt);
    }
    void withdrawl(long amnt){
        System.out.println("Withdrawl success "+amnt);
    }
}
class SavingAccount extends BankAccounts{
    void withdrawl(long amnt){
        if(amnt<100){
            System.out.println("Not withdrawl");
        }else{
            super.withdrawl(amnt);
        }
    }
}
public class Account{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long amnt=scanner.nextLong();
        BankAccounts s= new SavingAccount();
       // BankAccounts b=new BankAccounts();
        s.deposit(amnt);
        s.withdrawl(amnt);
        //b.withdrawl(amnt);
    }
}