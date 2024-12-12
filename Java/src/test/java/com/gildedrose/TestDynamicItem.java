package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDynamicItem {


    @Test
    void testAgedBrieBeforeExpiration() 
    {
        int[][] qualityEvolutionRatesTable = { {20, 1}, {0, -1} };
        Item agedBrie = new DynamicQualityItem("Aged Brie", 20, qualityEvolutionRatesTable,35 ); 


        // Checking after 10 days
        for (int i = 0; i < 10; i++) 
        {
            agedBrie.update();
        }
        assertEquals("Aged Brie", agedBrie.name);
        assertEquals(10, agedBrie.sellIn);
        assertEquals(45, agedBrie.quality);
    }

    @Test
    void testAgedBrieOnExpiration() 
    {
        int[][] qualityEvolutionRatesTable = { {20, 1}, {0, -1} };
        Item agedBrie = new DynamicQualityItem("Aged Brie", 20, qualityEvolutionRatesTable,35 ); 

        // Checking after 20 days
        for (int i = 0; i < 20; i++) 
        {
            agedBrie.update();
        }
        assertEquals("Aged Brie", agedBrie.name);
        assertEquals(0, agedBrie.sellIn);
        assertEquals(50, agedBrie.quality);
    }

    @Test
    void testAgedBrieAfterExpiration() 
    {
        int[][] qualityEvolutionRatesTable = { {20, 1}, {0, -1} };
        Item agedBrie = new DynamicQualityItem("Aged Brie", 20, qualityEvolutionRatesTable,35 ); 

        // Checking after 25 days
        for (int i = 0; i < 25; i++) 
        {
            agedBrie.update();
        }
        assertEquals("Aged Brie", agedBrie.name);
        assertEquals(0, agedBrie.sellIn);
        assertEquals(45, agedBrie.quality);
    }


    @Test
    void CinemaTicketTestBeforeExpiration() 
    {
        int[][] qualityEvolutionRatesTable = { {15, 1}, {5, 2},{0, -50} };
        Item cinemaTicket = new DynamicQualityItem("Cinema Tickets", 15, qualityEvolutionRatesTable,31 ); 


        // Checking after 10 days
        for (int i = 0; i < 10; i++) 
        {
            cinemaTicket.update();
        }
        assertEquals("Cinema Tickets", cinemaTicket.name);
        assertEquals(5, cinemaTicket.sellIn);
        assertEquals(41, cinemaTicket.quality);
    }

    @Test
    void CinemaTicketTestOnExpirationOnExpiration() 
    {
        int[][] qualityEvolutionRatesTable = { {15, 1}, {5, 2},{0, -50} };
        Item cinemaTicket = new DynamicQualityItem("Cinema Tickets", 15, qualityEvolutionRatesTable,31 ); 

        // Checking after 15 days
        for (int i = 0; i < 15; i++) 
        {
            cinemaTicket.update();
        }
        assertEquals("Cinema Tickets", cinemaTicket.name);
        assertEquals(0, cinemaTicket.sellIn);
        assertEquals(50, cinemaTicket.quality);
    }

    @Test
    void CinemaTicketTestAfterExpiration() 
    {
        int[][] qualityEvolutionRatesTable = { {15, 1}, {5, 2},{0, -50} };
        Item cinemaTicket = new DynamicQualityItem("Cinema Tickets", 15, qualityEvolutionRatesTable,31 ); 
        // Checking after 16 days
        for (int i = 0; i < 16; i++) 
        {
            cinemaTicket.update();
        }
        assertEquals("Cinema Tickets", cinemaTicket.name);
        assertEquals(0, cinemaTicket.sellIn);
        assertEquals(0, cinemaTicket.quality);
    }




        
}


