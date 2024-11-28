package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] 
        {
                
                //Classic Item 
                new Item("Ketchup", 15, true,  new int[][] { {15, -1}, {0,-2} } ,15 ), // 
                new Item("Apple", 7, true,  new int[][] { {30, -1},{0,-2} } ,30 ),
                new Item("Pear", 5, true,  new int[][] { {35, -1},{0,-2} } ,35 ),

                //Brie Item 
                new Item("Aged Brie", 10, true, new int[][] { {10, 1},{0,2} }, 0 ),
                new Item("Camembert", 30, true, new int[][] { {30, 1}, {5,2}}, 0 ),


                //BackStage Item 
                new Item("Backstage passes to a TAFKAL80ETC concert", 20, true, new int[][] { {20,1}, {10, 2},{5,3},{0,-50} }, 0 ),
                new Item("Backstage passes to a Bigflo & Oli concert", 30, true, new int[][] { {30, 1},{10,2}, {5,3},{0,-50}}, 5 ),
                new Item("Backstage passes to Tupac concert", 50, true, new int[][] { {50, 0},{20,1}, {5,5},{0,-50}}, 10 ),

                //Sulfuras, Hand of Ragnaros
                new Item("Sulfuras, Hand of Ragnaros", 10, false,  new int[][] { {10, 0} } ,80 ),
                new Item("Sulfuras, Hand of Ragnaros", -1, false,  new int[][] { {10, 0} } ,80 ),


                //Pasta 
                new Item("Pasta", 80, true,  new int[][] { {80, 0} , {10,-2}} ,40 )
        };


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
        GildedRose app = new GildedRose(items);

        int days = 15;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
