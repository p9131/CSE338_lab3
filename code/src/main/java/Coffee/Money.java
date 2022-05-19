package Coffee;

public class Money {
    int amount=0;

    public int update_amount(String action){
        if (action.equals("inc")){
            amount+=1;
        }
        else if(action.equals("coffee")){
            amount-=1;
        }
        return amount;
    }

    public static int update_amount_stub(String action){
        if (action.equals("inc")) return 1;

        return -1;
    }
}
