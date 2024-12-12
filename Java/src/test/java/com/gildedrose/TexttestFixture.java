package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {

        Item[] items = new Item[] 
        {
                
                //Classic Item 
                new ClassicItem("Ketchup", 15, 15 ), // 
                new ClassicItem("Apple", 7, 30 ),
                new ClassicItem("Pear", 5, 35 ),

                //Brie Item 
                new DynamicQualityItem("Aged Brie", 10, new int[][] { {10, 1},{0,2} }, 0 ),
                new DynamicQualityItem("Camembert", 30, new int[][] { {30, 1}, {5,2}}, 0 ),


                //BackStage Item 
                new DynamicQualityItem("Backstage passes to a TAFKAL80ETC concert", 20, new int[][] { {20,1}, {10, 2},{5,3},{0,-50} }, 0 ),
                new DynamicQualityItem("Backstage passes to a Bigflo & Oli concert", 30, new int[][] { {30, 1},{10,2}, {5,3},{0,-50}}, 5 ),
                new DynamicQualityItem("Backstage passes to Tupac concert", 50, new int[][] { {50, 0},{20,1}, {5,5},{0,-50}}, 10 ),

                //Conjured Item
                new DynamicQualityItem("Conjured item",10, new int[][] { {10, -2},{0,-4}}, 30 ),


                //Sulfuras, Hand of Ragnaros
                new LegendaryItem("Sulfuras, Hand of Ragnaros", 10, 80 ),
                new LegendaryItem("Sulfuras, Hand of Ragnaros", -1, 80 ),


                //Pasta 
                new ClassicItem("Pasta", 80, 40 )
        };



        GildedRose app = new GildedRose(items);

        int days = 5;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i <= days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update();
        }
    }

}


// Old code
/* 
new Item("+5 Dexterity Vest", 10, 20), //
new Item("Aged Brie", 2, 0), //
new Item("Elixir of the Mongoose", 5, 7), //
new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
new Item("Sulfuras, Hand of Ragnaros", -1, 80),
new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
// this conjured item does not work properly yet
new Item("Conjured Mana Cake", 3, 6) };
*/

                