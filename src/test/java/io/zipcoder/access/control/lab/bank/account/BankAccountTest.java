package io.zipcoder.access.control.lab.bank.account;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.net.ssl.SSLEngineResult.Status;


public class BankAccountTest {
	
	@Test
	public void testSetStatus(){
		BankAccount account = new BankAccount();
		assertTrue(account.setStatus(BankAccount.STATUS.OPEN));
		assertTrue(account.setStatus(BankAccount.STATUS.CLOSED));
		assertTrue(account.setStatus(BankAccount.STATUS.OFAC_FREEZE));
		assertFalse(account.setStatus(null));
	//	assertFalse(account.setStatus(BankAccount.STATUS.SUSPENDED));

	}
	
    @Test
    public void testRemainder(){
        Integer one = 7, two = 3;
        Integer expected = 1;
        Integer actual = this.math.remainder(one, two);
        assertTrue(expected == actual);
    }
	
	
}
/*
package Math;

import org.junit.Before;


/**
 * Created by dan on 6/14/17.
 */
/*
public class MathTest {


    Math math;

    @Before public void initialize(){
        math = new Math();
    }

    @Test
    public void testRemainder(){
        Integer one = 7, two = 3;
        Integer expected = 1;
        Integer actual = this.math.remainder(one, two);
        assertTrue(expected == actual);
    }

    @Test
    public void testGreaterThan(){
        assertTrue(this.math.greaterThanTrue(456,23));
        assertFalse(this.math.greaterThanFalse(1,3));
    }

    @Test
    public void testLessThan(){
        assertTrue(this.math.lessThanTrue(1 ,3));
        assertFalse(this.math.lessThanFalse(4,1));
    }

    @Test
    public void testLessOrEqual(){
        assertTrue(this.math.lessOrEqualTrue(3 , 3));
        assertTrue(this.math.lessOrEqualTrue(3, 6));
        assertFalse(this.math.lessOrEqualFalse(3, 1));
    }

    @Test
    public void testGreaterOrEqual(){
        assertTrue(this.math.greaterOrEqualTrue(4, 4));
        assertTrue(this.math.greaterOrEqualTrue(78, 5));
        assertFalse(this.math.greaterOrEqualFalse(4, 56));
    }

    @Test
    public void testLogicalAnd(){
        assertTrue(this.math.logicalAnd(3));
        assertFalse(this.math.logicalAnd(4));
    }

    @Test
    public void testLogicalOr(){
        assertTrue(this.math.logicalOr(4));
        assertTrue(this.math.logicalOr(14564));
        assertFalse(this.math.logicalOr(54));
        
*/