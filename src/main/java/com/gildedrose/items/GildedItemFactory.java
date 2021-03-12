package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * Creates items based on the item name ('Sulfurus', 'Aged Brie', 'Backstage Passes' and ordinary items)
 */
public class GildedItemFactory {

    public static GildedItem createGildedItem(Item item) {
        if (item.name == null || item.name.isBlank()) {
            throw new RuntimeException("Item with no name is not allowed!");
        }

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
            return new BackstagePassesItem(item);
        }

        if (item.name.startsWith("Conjured")) {
            return new OrdinaryItem(item, 2);
        }
        return new OrdinaryItem(item, 1);

    }

}
