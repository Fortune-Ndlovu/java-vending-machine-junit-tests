package com.example;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class VendingMachineTest {
    private VendingMachine vendingMachine;

    // 
    @Before
    public void setUp() {
        vendingMachine = new VendingMachine();
    }

    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testInsertCoin() {
        vendingMachine.insertCoin(10);
        assertEquals(10, vendingMachine.getBalance());
   }

   @Test
   public void testSelectProductWithEnoughBalance() {
        vendingMachine.insertCoin(25);
        String result = vendingMachine.selectProduct("Chips", 20);
        assertEquals("Here is your Chips. Enjoy!", result);
        assertEquals(5, vendingMachine.getBalance());
   }
}
