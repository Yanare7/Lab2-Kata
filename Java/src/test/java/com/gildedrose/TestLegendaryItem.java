package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLegendaryItem {


    @Test
    void testSulfuras() 
    {
        Item sulfuras = new LegendaryItem("Sulfuras, Hand of Ragnaros", 15,80 ); 

        // Vérifications après 10 jours
        for (int i = 0; i < 10; i++) 
        {
            sulfuras.update();
        }
        assertEquals(15, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);

        // Vérifications après 15 jours
        for (int i = 0; i < 5; i++) 
        {
            sulfuras.update();
        }
        assertEquals(15, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);



        // Vérifications après 20 jours
        for (int i = 0; i < 5; i++) 
        {
            sulfuras.update();
        }
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.name);
        assertEquals(15, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);
    }




        
}


