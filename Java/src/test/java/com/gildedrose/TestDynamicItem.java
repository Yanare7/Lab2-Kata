package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDynamicItem {


    @Test
    void testAgedBrie() 
    {
        int[][] qualityEvolutionRatesTable = { {20, 1}, {0, -1} };
        Item agedBrie = new DynamicQualityItem("Aged Brie", 20, qualityEvolutionRatesTable,35 ); 


        // Vérifications après 10 jours
        for (int i = 0; i < 10; i++) 
        {
            agedBrie.update();
        }
        assertEquals(10, agedBrie.sellIn);
        assertEquals(45, agedBrie.quality);

        // Vérifications après 20 jours
        for (int i = 0; i < 10; i++) 
        {
            agedBrie.update();
        }
        assertEquals(0, agedBrie.sellIn);
        assertEquals(50, agedBrie.quality);



        // Vérifications après 25 jours
        for (int i = 0; i < 5; i++) 
        {
            agedBrie.update();
        }
        assertEquals("Aged Brie", agedBrie.name);
        assertEquals(0, agedBrie.sellIn);
        assertEquals(45, agedBrie.quality);
    }


    @Test
    void CinemaTicketTest() 
    {
        int[][] qualityEvolutionRatesTable = { {15, 1}, {5, 2},{0, -50} };
        Item cinemaTicket = new DynamicQualityItem("Cinema Tickets", 15, qualityEvolutionRatesTable,31 ); 


        // Vérifications après 10 jours
        for (int i = 0; i < 10; i++) 
        {
            cinemaTicket.update();
        }
        assertEquals(5, cinemaTicket.sellIn);
        assertEquals(41, cinemaTicket.quality);

        // Vérifications après 15 jours
        for (int i = 0; i < 5; i++) 
        {
            cinemaTicket.update();
        }
        assertEquals(0, cinemaTicket.sellIn);
        assertEquals(50, cinemaTicket.quality);



        // Vérifications après 16 jours
        for (int i = 0; i < 1; i++) 
        {
            cinemaTicket.update();
        }
        assertEquals("Cinema Tickets", cinemaTicket.name);
        assertEquals(0, cinemaTicket.sellIn);
        assertEquals(0, cinemaTicket.quality);
    }




        
}


