/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aron3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class aron3Test {
    
    public aron3Test() {
    }
    
    @Test
    public void Teszt1() {
        String[] args = {"123"};         
        aron3.main(args);
    }
    
    @Test
    public void Teszt2() {
        String[] args = {"666","dd","pék","pék","pék"};
        aron3.main(args);
    }
    
    @Test
    public void Teszt3() {
        String[] args = {"55","3"};         
        aron3.main(args);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        aron3.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testPrime() {
        System.out.println("prime");
        int numm = 0;
        aron3.prime(numm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
