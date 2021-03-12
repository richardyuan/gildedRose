package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePassesItem implements GildedItem {

    private Item item;

    public BackstagePassesItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        increaseQualityIfNotOver50();
        decreaseSellIn();
        increaseQualityBasedOnSellIn();
        setQualityToZeroIfSellInDatePassed();
    }

    private void increaseQualityIfNotOver50() {
        if (item.quality < 50) item.quality++;
    }

    private void decreaseSellIn() {
        item.sellIn--;
    }

    private void increaseQualityBasedOnSellIn() {
        if (item.sellIn <= 10) {
            increaseQualityIfNotOver50();
        }
        if (item.sellIn <= 7) {
            increaseQualityIfNotOver50();
        }
    }

    private void setQualityToZeroIfSellInDatePassed() {
        if (item.sellIn < 0) item.quality = 0;
    }

}
