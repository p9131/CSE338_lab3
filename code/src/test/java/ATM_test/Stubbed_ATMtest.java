package ATM_test;

import ATM.ATM;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

class Stubbed_ATMtest {
    ATM atm;

    @BeforeEach
    void before(){
        atm=new ATM();
    }

    @Test
    void ATM_deposit(){
        boolean is_deposit=true;
        int balance = atm.make_transaction_using_stub(50, is_deposit);
        assertEquals(50,balance);
    }

    @Test
    void ATM_depositThenWithdraw(){
        boolean is_deposit=true;
        atm.make_transaction_using_stub(150, is_deposit);
        is_deposit=false;
        int balance = atm.make_transaction_using_stub(50, is_deposit);
        assertEquals(100,balance);
    }

    @Test
    void ATM_withdraw(){
        boolean is_deposit=true;
        atm.make_transaction_using_stub(50, is_deposit);
        is_deposit=false;
        int balance = atm.make_transaction_using_stub(1500, is_deposit);
        assertEquals(50,balance);
    }

    @AfterEach
    void clear(){
        atm=null;
    }

}