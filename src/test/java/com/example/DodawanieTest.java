package com.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DodawanieTest {
    @Test
    public void added(){
        Dodawanie dodawanie= new Dodawanie();
        assertEquals(10,dodawanie.added(5,5));
    }
}
