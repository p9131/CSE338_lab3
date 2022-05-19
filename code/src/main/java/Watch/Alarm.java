package Watch;

public class Alarm {
    public static String[] alarm(char input, String state, String state1) {
        String[] states = new String[2];
        states[0] = state;
        states[1] = state1;
        if (input == 'd') {
            states[0] = "NORMAL";
            states[1] = "TIME";
        } else if (input == 'a') {
            if (state1 == "ALARM")
                states[1] = "CHIME";
        }
        return states;
    }


    public static String[] stub_alarm_function(char input, String state, String state1) {
        String[] states = new String[2];states[0] = state;states[1] = state1;
        if (input == 'd') {states[0] = "NORMAL";states[1] = "TIME";}
        else if (input == 'a' && state1 == "ALARM")
                states[1] = "CHIME";

        return states;
    }


}
