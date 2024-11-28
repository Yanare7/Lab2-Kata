package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public boolean isPerishable = true;

    public int[][] qualityEvolutionRatesTable;

    public int quality;

<<<<<<< HEAD
    public Item(String name, int sellIn, boolean isPerishable, int[][] qualityEvolution, int quality) 
    {
=======
    public Item(String name, int sellIn, bool isPerishable, int[][] qualityEvolution, int quality) {
>>>>>>> 859d0379a5db0ca77e04ceb37bd0e5e80dd12020
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
