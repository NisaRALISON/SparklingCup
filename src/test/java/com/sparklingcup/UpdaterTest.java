package com.sparklingcup;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UpdaterTest {

    @Test
    public void defaultUpdaterTest() {
        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Elixir of the Mongoose", -2, 40),
                new Item("Elixir of the Mongoose", 2, 50) //

        };

        SparklingCup sparklingCup = new SparklingCup(items,new UpdaterRegistry());
        sparklingCup.updateQuality();

        Item[] itemsAfterUpdate = new Item[]{
                new Item("+5 Dexterity Vest", 9, 19),
                new Item("Elixir of the Mongoose", -3, 38),
                new Item("Elixir of the Mongoose", 1, 49) //

        };

        for (int i = 0 ; i < items.length; i++) {
            assertEquals(items[i].name,itemsAfterUpdate[i].name);
            assertEquals(items[i].sellIn,itemsAfterUpdate[i].sellIn);
            assertEquals(items[i].quality,itemsAfterUpdate[i].quality);
        }
    }

    @Test
    public void agedBrieUpdaterTest() {
        Item[] items = new Item[]{
                new Item("Aged Brie", 2, 12),
                new Item("Aged Brie", -2, 40),
                new Item("Aged Brie", 2, 50) //

        };

        SparklingCup sparklingCup = new SparklingCup(items,new UpdaterRegistry());
        sparklingCup.updateQuality();

        Item[] itemsAfterUpdate = new Item[]{
                new Item("Aged Brie", 1, 13),
                new Item("Aged Brie", -3, 42),
                new Item("Aged Brie", 1, 50) //

        };

        for (int i = 0 ; i < items.length; i++) {
            assertEquals(items[i].name,itemsAfterUpdate[i].name);
            assertEquals(items[i].sellIn,itemsAfterUpdate[i].sellIn);
            assertEquals(items[i].quality,itemsAfterUpdate[i].quality);
        }
    }

    @Test
    public void backstagePassUpdaterTest() {
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 30),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50)

        };

        SparklingCup sparklingCup = new SparklingCup(items,new UpdaterRegistry());
        sparklingCup.updateQuality();

        Item[] itemsAfterUpdate = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22),
                new Item("Backstage passes to a TAFKAL80ETC concert", 8, 22),
                new Item("Backstage passes to a TAFKAL80ETC concert", 3, 33),
                new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", -2, 0)//

        };

        for (int i = 0 ; i < items.length; i++) {
            assertEquals(items[i].name,itemsAfterUpdate[i].name);
            assertEquals(items[i].sellIn,itemsAfterUpdate[i].sellIn);
            assertEquals(items[i].quality,itemsAfterUpdate[i].quality);
        }
    }

    @Test
    public void sulfurasUpdaterTest() {
        Item[] items = new Item[]{
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -11, 80),
                new Item("Sulfuras, Hand of Ragnaros", 2, 80)

        };

        SparklingCup sparklingCup = new SparklingCup(items,new UpdaterRegistry());
        sparklingCup.updateQuality();

        Item[] itemsAfterUpdate = new Item[]{
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -11, 80),
                new Item("Sulfuras, Hand of Ragnaros", 2, 80)

        };

        for (int i = 0 ; i < items.length; i++) {
            assertEquals(items[i].name,itemsAfterUpdate[i].name);
            assertEquals(items[i].sellIn,itemsAfterUpdate[i].sellIn);
            assertEquals(items[i].quality,itemsAfterUpdate[i].quality);
        }
    }

    @Test
    public void conjuredPassUpdaterTest() {
        Item[] items = new Item[]{
                new Item("Conjured Mana Cake", 3, 6),
                new Item("Conjured Mana Cake", -2, 10),
                new Item("Conjured Mana Cake", -3, 1)

        };

        SparklingCup sparklingCup = new SparklingCup(items,new UpdaterRegistry());
        sparklingCup.updateQuality();

        Item[] itemsAfterUpdate = new Item[]{
                new Item("Conjured Mana Cake", 2, 4),
                new Item("Conjured Mana Cake", -3, 6),
                new Item("Conjured Mana Cake", -4, 0)

        };

        for (int i = 0 ; i < items.length; i++) {
            assertEquals(items[i].name,itemsAfterUpdate[i].name);
            assertEquals(items[i].sellIn,itemsAfterUpdate[i].sellIn);
            assertEquals(items[i].quality,itemsAfterUpdate[i].quality);
        }
    }
}
