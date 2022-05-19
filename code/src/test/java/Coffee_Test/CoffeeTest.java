package Coffee_Test;

import Coffee.Coffee;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

class CoffeeTest {
    Coffee cof;

    @BeforeEach
    void before(){
        cof=new Coffee();
    }

    @Test
    void make_coffee_usingStub(){
        String [] input={"POWER_ON","inc","coffee"};
        cof.get_inp(input,3);
        String [] expected={"ON","EMPTY","ON","ON"};
        String [] actual={cof.getState(),cof.getState1(),cof.is_power(),cof.is_light()};
        assertArrayEquals(" ",expected,actual);
        assertEquals(0,cof.getM());
    }

    @Test
    void make_coffee2(){
        String [] input={"POWER_ON","POWER_OFF"};
        cof.get_inp(input,2);
        String [] expected={"OFF","OFF","OFF","OFF"};
        String [] actual={cof.getState(),cof.getState1(),cof.is_power(),cof.is_light()};
        assertArrayEquals(" ",expected,actual);
        assertEquals(0,cof.getM());
    }

    @Test
    void make_coffee3(){
        String [] input={"POWER_ON","inc","coffee","inc","coffee","inc","inc"};
        cof.get_inp(input,7);
        String [] expected={"ON","NOT_EMPTY","ON","ON"};
        String [] actual={cof.getState(),cof.getState1(),cof.is_power(),cof.is_light()};
        assertArrayEquals(" ",expected,actual);
        assertEquals(2,cof.getM());
    }

    @AfterEach
    void clear(){
        cof=null;
    }
}