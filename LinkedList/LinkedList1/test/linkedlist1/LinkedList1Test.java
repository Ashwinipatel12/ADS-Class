/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package linkedlist1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bored
 */
public class LinkedList1Test {
    
    public LinkedList1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class LinkedList1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LinkedList1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class LinkedList1.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        int item = 0;
        LinkedList1 instance = new LinkedList1();
        instance.addLast(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class LinkedList1.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        int item = 0;
        LinkedList1 instance = new LinkedList1();
        instance.addFirst(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class LinkedList1.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        LinkedList1 instance = new LinkedList1();
        instance.removeFirst();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class LinkedList1.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        LinkedList1 instance = new LinkedList1();
        instance.removeLast();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class LinkedList1.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedList1 instance = new LinkedList1();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class LinkedList1.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        LinkedList1 instance = new LinkedList1();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
