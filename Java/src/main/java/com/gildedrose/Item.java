package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public bool isPerishable = True;

    public int[][] qualityEvolution;

    public int quality;

    public Item(String name, int sellIn, bool isPerishable, int[][] qualityEvolution, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.isPerishable = isPerishable; 
        this.qualityEvolution= qualityEvolution;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
