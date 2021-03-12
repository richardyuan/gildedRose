package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * For ordinary items and "Conjured" items
 */
public class OrdinaryItem implements GildedItem {

    private Item item;
    private int qualityDegradationValue;

    public OrdinaryItem(Item item, Integer qualityDegradationValue) {
        this.item = item;
        this.qualityDegradationValue = qualityDegradationValue;
    }

    @Override
    public void updateQuality() {
        decreaseQualityIfPositive(qualityDegradationValue);
        decreaseSellIn();
        decreaseQualityIfSellInNegative(qualityDegradationValue);
    }

    private void decreaseQualityIfPositive(Integer number) {
        if (item.quality > 0) item.quality -= number;
    }

    private void decreaseSellIn() {
        item.sellIn--;
    }

    private void decreaseQualityIfSellInNegative(Integer number) {
        if (item.sellIn < 0) item.quality -= number;
    }


}
