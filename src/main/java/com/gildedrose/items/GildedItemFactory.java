package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * Creates items based on the item name ('Sulfurus', 'Aged Brie', 'Backstage Passes' and ordinary items)
 */
public class GildedItemFactory {

    public static GildedItem createGildedItem(Item item) {
        if (item.quality < 0 || item.quality > 50) {
            throw new RuntimeException("Quality cannot be negative or above 50!");
        }

        if (item.name.startsWith("Sulfuras")) {
            return new Sulfuras(item);
        }

        if (item.name.startsWith("Aged Brie")) {
            return new AgedBrie(item);
        }

        if (item.name.startsWith("Backstage passes")) {
            return new BackstagePasses(item);
        }

        return new OrdinaryItem(item);
    }

}
