package com.gildedrose.items;

import com.gildedrose.Item;

public class OrdinaryItem implements GildedItem {

    private Item item;

    public OrdinaryItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        decreaseQualityIfPositive();
        decreaseSellIn();
        decreaseQualityIfSellInNegative();
    }

    private void decreaseQualityIfPositive() {
        if (item.quality > 0) item.quality--;
    }

    private void decreaseSellIn() {
        item.sellIn--;
    }

    private void decreaseQualityIfSellInNegative() {
        if (item.sellIn < 0) item.quality--;
    }


}
