/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 *
 * @author Louay
 */
public class RovarTest {

    //Rovar method are static, so no need for class or object declaration


    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovWithString() {
        assertEquals("RORasosmomusos", Rovar.enrov("Rasmus"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithString() {
        assertEquals("Rasmus", Rovar.derov("RORasosmomusos"));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovWithoutString() {
        assertEquals("", Rovar.enrov(""));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithoutString() {
        assertEquals("", Rovar.derov(""));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovWithNumbers() {
        assertEquals("123456789", Rovar.enrov("123456789"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithNumbers() {
        assertEquals("123456789", Rovar.derov("123456789"));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovWithLettersNumbers() {
        assertEquals("abobcoc123", Rovar.enrov("abc123"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithLettersNumbers() {
        assertEquals("abc123", Rovar.derov("abobcoc123"));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovWithMixChars() {
        assertEquals("a-bob+coc1*2#3", Rovar.enrov("a-b+c1*2#3"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithMixChars() {
        assertEquals("a-b+c1*2#3", Rovar.derov("a-bob+coc1*2#3"));
    }





    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovWithNullpointer() {
        String s = null;
        assertEquals(s, Rovar.enrov(s));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithNullpointer() {
        String s = null;
        assertEquals(s, Rovar.derov(s));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovLowerCase() {
        String s = "bobcocdodfofgoghohjojkoklolmomnonpopqoqrorsostotvovwowxoxzoz";
        assertEquals(s, Rovar.enrov("bcdfghjklmnpqrstvwxz"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithLowerCase() {
        String s = "bobcocdodfofgoghohjojkoklolmomnonpopqoqrorsostotvovwowxoxzoz";
        assertEquals("bcdfghjklmnpqrstvwxz", Rovar.derov(s));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovUpperCase() {
        String s = "BOBCOCDODFOFGOGHOHJOJKOKLOLMOMNONPOPQOQRORSOSTOTVOVWOWXOXZOZ";
        assertEquals(s, Rovar.enrov("BCDFGHJKLMNPQRSTVWXZ"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithUpperCase() {
        String s = "BOBCOCDODFOFGOGHOHJOJKOKLOLMOMNONPOPQOQRORSOSTOTVOVWOWXOXZOZ";
        assertEquals("BCDFGHJKLMNPQRSTVWXZ", Rovar.derov(s));
    }




    /**
     * Test of enrov method, of class Rovar.
     */
    @Test
    public void testEnrovVowels() {
        assertEquals("aeiouy", Rovar.enrov("aeiouy"));
    }

    /**
     * Test of derov method, of class Rovar.
     */
    @Test
    public void testDerovWithVowels() {
        assertEquals("aeiouy", Rovar.derov("aeiouy"));
    }




}
