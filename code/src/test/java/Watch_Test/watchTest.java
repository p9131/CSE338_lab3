package Watch_Test;
import Watch.watch;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;


class watchTest {
    watch w1;

    @BeforeEach
    void before(){
        w1=new watch();
    }


    @Test
    void watch_using_alarmStub(){
        w1.get_inp("ba");
        assertEquals("ALARM",w1.getState());
        assertEquals("CHIME",w1.getState1());
    }

    @Test
    void watch_update_date(){
        w1.get_inp("caaabbbbbabb");
        assertEquals("2002-6-1",w1.DisplayDate());
    }

    @Test
    void watch_update_time(){
        w1.get_inp("cbbbbbbabb");
        assertEquals("2:6",w1.DisplayTIME());
    }

    @AfterEach
    void clear(){
        w1=null;
    }
}