package ATM;

public class ATM extends account {

    account a = new account();
    public int balance=0;

    public int make_transaction(int amount, boolean is_deposit){
        if(!is_deposit && amount>this.balance){
            System.out.println("No enough funds");
            return this.balance;
        }
        balance = account.update_balance(balance,amount,is_deposit);
        return balance;
    }

    public int make_transaction_using_stub(int amount, boolean is_deposit){
        if(!is_deposit && amount>this.balance){
            System.out.println("No enough funds");
            return this.balance;
        }
        balance = account.stub_update_balance(balance,amount,is_deposit);
        return balance;
    }


}
