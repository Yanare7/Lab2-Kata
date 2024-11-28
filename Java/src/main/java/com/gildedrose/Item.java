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

    public void update()
    {
        updateSellIn();
        updateQuality();
    }

    public void updateQuality()
    {
        int newQuality = getQualitySlope();
        if (newQuality<=0)
        {
            quality =0;
        }
        else if (newQuality>=50)
        {
            quality =50;
        }
        else
        {
            quality = newQuality;
        }
    }

    public void updateSellIn()
    {
        if (isPerishable) 
        {
            sellIn = Math.max(0, sellIn - 1);
        }   
    }

    public int getQualitySlope()
    {

        for(int i =0; i<qualityEvolutionRatesTable.length; i++)
        {
            if (sellIn<=qualityEvolutionRatesTable[i][0])
            {
                return qualityEvolutionRatesTable[i][1];
            }
        }
        System.out.println("Error wesh "+name);
        throw new IllegalStateException("No matching quality slope found for item: " + name);    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
