class BankAccount{
    int accno;
    String accHolderName;
    double balance;

    BankAccount(int accno,String accHolderName,double balance){
        this.accno=accno;
        this.accHolderName=accHolderName;
        this.balance=balance;
    }
    void display(){
        System.out.println("Account number     : "+accno);
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Balance            : "+balance);
    }
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposit: "+amount);
        System.out.println("Balance: "+balance);

    }
    void withdraw(int amount){
        balance=balance-amount;
        System.out.println("Withdraw: "+amount);
        System.out.println("Balance: "+balance);
    }
}
public class banksystem{
    public static void main(String[] args){
        BankAccount b1=new BankAccount(1001, "Sitharth", 5000);
        b1.display();
        b1.deposit(2000);
        b1.withdraw(1000);

    }
}