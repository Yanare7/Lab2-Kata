package com.gildedrose;

public abstract class Item
{
    protected String name;
    protected int sellIn;
    protected int quality;

 
    public Item(String name, int sellIn, int quality) 
    {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    public abstract void update();


    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() 
    {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
