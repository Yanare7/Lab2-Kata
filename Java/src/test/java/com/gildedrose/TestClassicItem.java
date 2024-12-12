package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClassicItem {


    @Test
    void testKetchupBeforeExpiration() 
    {
        Item ketchup = new ClassicItem("Ketchup", 15,35 ); 

        // Checking after 10 days
        for (int i = 0; i < 10; i++) 
        {
            ketchup.update();
        }
        assertEquals("Ketchup", ketchup.name);
        assertEquals(5, ketchup.sellIn);
        assertEquals(25, ketchup.quality);
    }

    @Test
    void testKetchupOnExpiration() 
    {
        Item ketchup = new ClassicItem("Ketchup", 15,35 );
        // Checking after 15 days
        for (int i = 0; i < 15; i++) 
        {
            ketchup.update();
        }
        assertEquals("Ketchup", ketchup.name);
        assertEquals(0, ketchup.sellIn);
        assertEquals(20, ketchup.quality);
    }

    @Test
    void testKetchupAfterExpiration() 
    {
        Item ketchup = new ClassicItem("Ketchup", 15,35 ); 
        // Checking after 20 days
        for (int i = 0; i < 20; i++) 
        {
            ketchup.update();
        }
        assertEquals("Ketchup", ketchup.name);
        assertEquals(0, ketchup.sellIn);
        assertEquals(10, ketchup.quality);
    }


    @Test
    void PicklesTestBeforeExpiration() 
    {
        Item pickles = new ClassicItem("Pickles", 15,35 ); 

        // Checking after 10 days
        for (int i = 0; i < 10; i++) 
        {
            pickles.update();
        }
        assertEquals("Pickles", pickles.name);
        assertEquals(5, pickles.sellIn);
        assertEquals(25, pickles.quality);
    }

    @Test
    void PicklesTestOnExpiration() 
    {
        Item pickles = new ClassicItem("Pickles", 15,35 ); 

        // Checking after 15 days
        for (int i = 0; i < 15; i++) 
        {
            pickles.update();
        }
        assertEquals("Pickles", pickles.name);
        assertEquals(0, pickles.sellIn);
        assertEquals(20, pickles.quality);

    }
    @Test
    void PicklesTestAfterExpiration() 
    {
        Item pickles = new ClassicItem("Pickles", 15,35 ); 

        // Checking after 20 days
        for (int i = 0; i < 20; i++) 
        {
            pickles.update();
        }
        assertEquals("Pickles", pickles.name);
        assertEquals(0, pickles.sellIn);
        assertEquals(10, pickles.quality);
    }
        
}


