package ATM;

public class account {

    public static int stub_update_balance(int balance, int amount, boolean is_deposit){
        if(is_deposit){return amount+balance;}
        return (-1*amount)+balance;
    }

    public static int update_balance(int balance, int amount, boolean is_deposit){
        if (!is_deposit){
            amount*=-1;
        }
        balance+=amount;
        return balance;
    }

}
