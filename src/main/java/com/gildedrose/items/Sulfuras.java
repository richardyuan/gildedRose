package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras implements GildedItem {

    private Item item;

    public Sulfuras(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        //DOES NOTHING!
    }
}
