package com.gildedrose;


public class ClassicItem extends Item 
{
    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;

    
    public ClassicItem(String name, int sellIn, int quality) 
    {
        super(name, sellIn, quality);
    }

    @Override
    public void update() 
    {
        updateQuality();
        updateSellIn();
    }


    public void updateQuality()
    {
        if (sellIn>0)
        {
            setQuality(quality -1);
        }
        else
        {
            setQuality(quality -2);
        }

    }
    

    public void updateSellIn()
    {
        sellIn = Math.max(0, sellIn - 1);  
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
