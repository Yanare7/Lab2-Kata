package com.gildedrose;

class GildedRose 
{
    Item[] items;


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
        Item[] items = { 
            new ClassicItem("Ketchup", 15, 35),
            new DynamicQualityItem("Aged Brie", 20, qualityEvolutionRatesTable, 35),
            new LegendaryItem("Sulfuras, Hand of Ragnaros", 15, 80) 
        };
        GildedRose gildedrose = new GildedRose(items);
        for (int i=0; i<4; i++){
            gildedRose.update();
        }
    }

    

}                
            /*
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;git a
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
            */
        
 


/*
 * 
 * 
 *       if (!items[i].isPerishable) {
            items[i].sellIn = items[i].sellIn - 1;
            if (items[i].sellIn == 0){
                items[i].quality = items[i].quality - 1;
            }
        }
        
        if (items[i].quality < 50 && items[i].quality > 0) {
            if (items[i].sellIn <= items[i].qualityEvolutionRatesTable[0][0]){
                int counter = 0;
                int length = items[i].qualityEvolutionRatesTable.length;
                while (items[i].sellIn <= items[i].qualityEvolutionRatesTable[counter+1][0]){
                    counter ++;
                }
                int newQuality = items[i].quality + items[i].qualityEvolutionRatesTable[counter+1][1];
                if (newQuality < 0){
                    items[i].quality = 0;
                }
                else if (newQuality > 50){
                    items[i].quality = 50;
                }
                else {
                    items[i].quality = newQuality;
                }
            }
        }
 */
