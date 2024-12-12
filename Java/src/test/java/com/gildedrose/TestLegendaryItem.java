package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLegendaryItem {


    @Test
    void testSulfuras1() 
    {
        Item sulfuras = new LegendaryItem("Sulfuras, Hand of Ragnaros", 15,80 ); 

        // Checking after 10 days
        for (int i = 0; i < 10; i++) 
        {
            sulfuras.update();
        }
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.name);
        assertEquals(15, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);
    }

    @Test
    void testSulfuras2() 
    {
        Item sulfuras = new LegendaryItem("Sulfuras, Hand of Ragnaros", 15,80 ); 

        // Checking after 15 days
        for (int i = 0; i < 15; i++) 
        {
            sulfuras.update();
        }
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.name);
        assertEquals(15, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);
    }
    
    @Test
    void testSulfuras3() 
    {
        Item sulfuras = new LegendaryItem("Sulfuras, Hand of Ragnaros", 15,80 ); 
        // Checking after 20 days
        for (int i = 0; i < 20; i++) 
        {
            sulfuras.update();
        }
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.name);
        assertEquals(15, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);
    }     
}


