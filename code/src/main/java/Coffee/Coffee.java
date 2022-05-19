package Coffee;

import Coffee.Money;

public class Coffee {
    String power="OFF";
    String light="OFF";
    String state="OFF";
    String state1="OFF";
    Money user=new Money();
    int money;


    public void get_inp(String [] s, int n){
        for (int i = 0; i < n; i++) {
            String input = s[i];
            switch (state) {
                case "OFF":
                    if (input.equals("POWER_ON")) {
                        state = "ON";
                        state1 = "EMPTY";
                        power = "ON";
                        light = "ON";
                        money = 0;
                    }
                    break;

                case "ON":
                    if (input.equals("POWER_OFF")) {
                        power = "OFF";
                        light = "OFF";
                        state = "OFF";
                        state1 = "OFF";
                    } else if (input.equals("inc")||
                            (input.equals("coffee") && money>0)
                    ) {
                        money += Money.update_amount_stub(input);
                        if(money==0)state1 = "EMPTY";
                        else state1 = "NOT_EMPTY";
                    }

            }}}


    public String is_power() {
        return power;
    }

    public String is_light() {
        return light;
    }

    public String getState() {
        return state;
    }

    public String getState1() {
        return state1;
    }


    public int getM() {
        return money;
    }
}
