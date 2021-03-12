package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie implements GildedItem {

    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        increaseQualityIfNotOver50();
        decreaseSellIn();
        increaseQualityIfSellInNegative();
    }

    private void increaseQualityIfNotOver50() {
        if (item.quality < 50) item.quality++;
    }

    private void decreaseSellIn() {
        item.sellIn--;
    }

    private void increaseQualityIfSellInNegative() {
        if (item.sellIn < 0) {
            increaseQualityIfNotOver50();
        }
    }
}
