package com.gildedrose;

class GildedRose 
{
    private Item[] items;


    public GildedRose(Item[] items) 
    {
        this.items = items;
    }

    public void update() 
    {
        for (int i = 0; i < items.length; i++) 
        {
            items[i].update();
        }
    }

    public static void main(String[] args){
        int[][] qualityEvolutionRatesTable = { {20, 1}, {0, -1} };

        Item[] items = new Item[]{
            new ClassicItem("Ketchup", 15, 35),
            new DynamicQualityItem("Aged Brie", 20, qualityEvolutionRatesTable, 35),
            new LegendaryItem("Sulfuras, Hand of Ragnaros", 15, 80),
        };

        GildedRose gildedRose = new GildedRose(items);
        for (int i=0; i<4; i++){
            gildedRose.update();
        }
    }

    

} 
