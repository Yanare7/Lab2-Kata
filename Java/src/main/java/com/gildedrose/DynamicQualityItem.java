package com.gildedrose;


public class DynamicQualityItem extends Item 
{
    protected int[][] qualityEvolutionRatesTable;

    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;

    public DynamicQualityItem(String name, int sellIn, int[][] qualityEvolutionRatesTable, int quality) 
    {
        super(name, sellIn, quality);

        this.qualityEvolutionRatesTable= qualityEvolutionRatesTable;
    }

    @Override
    public void update() 
    {
        updateQuality();
        updateSellIn();
    }


    public void updateQuality()
    {
        int newQuality = quality + getQualitySlope();
        setQuality(newQuality);
    }
    

    public void updateSellIn()
    {
        sellIn = Math.max(0, sellIn - 1);  
    }


    public int getQualitySlope()
    {
        if (sellIn>qualityEvolutionRatesTable[0][0])
        {
            throw new IllegalStateException("No matching quality slope found for item: " + name);    
        }

        for (int i=0;i<qualityEvolutionRatesTable.length; i++)
        {
            if (sellIn>qualityEvolutionRatesTable[i][0])
            {
                return qualityEvolutionRatesTable[i-1][1];
            }
        }
        return qualityEvolutionRatesTable[qualityEvolutionRatesTable.length-1][1];
    }


    public void setQuality(int newQuality)
    {
        if (newQuality <= MIN_QUALITY)
        {
            quality = MIN_QUALITY;
        }
        else if (newQuality >= MAX_QUALITY)
        {
            quality = MAX_QUALITY;
        }
        else
        {
            quality = newQuality;
        }
    }

}
