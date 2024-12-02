package com.gildedrose;


public class UnperishableItem extends Item 
{
    protected int[][] qualityEvolutionRatesTable;
    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;


    public UnperishableItem(String name, int sellIn, int[][] qualityEvolutionRatesTable, int quality) 
    {
        super(name, sellIn, quality);

        this.qualityEvolutionRatesTable= qualityEvolutionRatesTable;
    }

    @Override
    public void update() 
    {
        this.updateQuality();
    }


    public void updateQuality()
    {
        int newQuality = getQualitySlope();

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
        throw new IllegalStateException("No matching quality slope found for item: " + name);    
    }


}
