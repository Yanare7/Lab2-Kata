package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClassicItem {


    @Test
    void testKetchup() 
    {
        Item ketchup = new ClassicItem("Ketchup", 15,35 ); 

        // Vérifications après 10 jours
        for (int i = 0; i < 10; i++) 
        {
            ketchup.update();
        }
        assertEquals(5, ketchup.sellIn);
        assertEquals(25, ketchup.quality);

        // Vérifications après 15 jours
        for (int i = 0; i < 5; i++) 
        {
            ketchup.update();
        }
        assertEquals(0, ketchup.sellIn);
        assertEquals(20, ketchup.quality);



        // Vérifications après 20 jours
        for (int i = 0; i < 5; i++) 
        {
            ketchup.update();
        }
        assertEquals("Ketchup", ketchup.name);
        assertEquals(0, ketchup.sellIn);
        assertEquals(10, ketchup.quality);
    }


    @Test
    void PicklesTest() 
    {
        Item pickles = new ClassicItem("Pickles", 15,35 ); 

        // Vérifications après 10 jours
        for (int i = 0; i < 10; i++) 
        {
            pickles.update();
        }
        assertEquals(5, pickles.sellIn);
        assertEquals(25, pickles.quality);

        // Vérifications après 15 jours
        for (int i = 0; i < 5; i++) 
        {
            pickles.update();
        }
        assertEquals(0, pickles.sellIn);
        assertEquals(20, pickles.quality);

        // Vérifications après 20 jours
        for (int i = 0; i < 5; i++) 
        {
            pickles.update();
        }
        assertEquals("Pickles", pickles.name);
        assertEquals(0, pickles.sellIn);
        assertEquals(10, pickles.quality);
    }
        
}


