package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public boolean isPerishable = true;

    public int[][] qualityEvolutionRatesTable;

    public int quality;

    public Item(String name, int sellIn, boolean isPerishable, int[][] qualityEvolutionRatesTable, int quality) 
    {
        this.name = name;
        this.sellIn = sellIn;
        this.isPerishable = isPerishable; 
        this.qualityEvolutionRatesTable= qualityEvolutionRatesTable;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
