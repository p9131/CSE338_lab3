package Watch;
import Watch.Alarm;

public class watch {
    public String state= "NORMAL";
    public String state1="TIME";
    public int m=0,h=0, D=1,M=1, Y=2000;

    public String getState() {
        return state;
    }

    public String getState1() {
        return state1;
    }

    public void get_inp(String s){
        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);
            switch (state) {
                case "NORMAL":
                    if (input == 'c') {state = "UPDATE";    state1 = "MIN";}
                    else if (input == 'b') {state = "ALARM";     state1 = "ALARM";}
                    else if (input == 'a') {
                        if (state1 == "TIME") state1 = "DATE";
                        else state1 = "TIME";
                    }
                    break;

                case "UPDATE":
                    if (input == 'd') {state = "NORMAL";    state1 = "TIME";}

                    else if (input == 'a') {
                        if (state1 == "MIN")
                            state1 = "HOUR";
                        else if (state1 == "HOUR")
                            state1 = "DAY";
                        else if (state1 == "DAY")
                            state1 = "MONTH";
                        else if (state1 == "MONTH")
                            state1 = "YEAR";
                        else if (state1 == "YEAR")
                            {state = "NORMAL";    state1 = "TIME";}
                    }

                    else if (input == 'b') {
                        if (state1 == "MIN")
                            {
                                m+=1;
                                if(m==60){
                                    m=0;
                                    h++;
                                }
                            }
                        else if (state1 == "HOUR")
                        {
                            h+=1;
                            if(h==24){
                                h=0;
                                D++;
                            }
                        }
                        else if (state1 == "DAY")
                        {
                            D+=1;
                            if(D==31){
                                D=1;
                                M++;
                            }
                        }
                        else if (state1 == "MONTH")
                        {
                            M+=1;
                            if(M==13){
                                M=1;
                                Y++;
                            }
                        }
                        else if (state1 == "YEAR")
                            Y+=1;
                    }
                    break;

                case "ALARM":
                    String [] states = Alarm.stub_alarm_function(input,state,state1);
                    state = states[0];
                    state1 = states[1];
                    break;
            }
        }
    }
    public String DisplayDate() {
        String date = Y+"-"+M+"-"+D;
        System.out.println(date);
        return date;
    }
    public String DisplayTIME() {
        String time=h+":"+m;
        System.out.println(time);
        return time;

    }


}


