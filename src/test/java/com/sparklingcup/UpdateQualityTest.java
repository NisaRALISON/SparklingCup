package com.sparklingcup;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UpdateQualityTest {

    Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            new Item("Conjured Mana Cake", 3, 6) };

    SparklingCup sparklingCup = new SparklingCup(items,new UpdaterRegistry());

    int daysNumber = 100;

    @Test
    public void updaterTest() {
        for (int i = 0; i < daysNumber; i++) {

            //Test du premier Jour
            if(i == 1) {
                System.out.println("-------- day " + i + " --------");
                System.out.println("name, sellIn, quality");
                Item[] itemsTest = new Item[] {
                        new Item("+5 Dexterity Vest", 9, 19), //
                        new Item("Aged Brie", 1, 1), //
                        new Item("Elixir of the Mongoose", 4, 6), //
                        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                        new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
                        new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
                        new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
                        new Item("Conjured Mana Cake", 2, 4) };

                for(int j = 0 ; j < items.length ; j++ ) {
                    Item itemOrigin = items[j];
                    Item itemAfterUpdate = itemsTest[j];
                    System.out.println(itemAfterUpdate.name+","+itemAfterUpdate.sellIn+","+itemAfterUpdate.quality);
                    assertEquals(itemOrigin.name, itemAfterUpdate.name);
                    assertEquals(itemOrigin.sellIn, itemAfterUpdate.sellIn);
                    assertEquals(itemOrigin.quality, itemAfterUpdate.quality);
                }
            }

            //Test 11 eme jour
            if(i == 11) {
                System.out.println("-------- day " + i + " --------");
                System.out.println("name, sellIn, quality");
                Item[] itemsTest = new Item[] {
                        new Item("+5 Dexterity Vest", -1, 8), //
                        new Item("Aged Brie", -9, 20), //
                        new Item("Elixir of the Mongoose", -6, 0), //
                        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                        new Item("Backstage passes to a TAFKAL80ETC concert", 4, 38),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -6, 0),
                        // this conjured item does not work properly yet
                        new Item("Conjured Mana Cake", -8, 0) };

                for(int j = 0 ; j < items.length ; j++ ) {
                    Item itemOrigin = items[j];
                    Item itemAfterUpdate = itemsTest[j];
                    System.out.println(itemAfterUpdate.name+","+itemAfterUpdate.sellIn+","+itemAfterUpdate.quality);
                    assertEquals(itemOrigin.name, itemAfterUpdate.name);
                    assertEquals(itemOrigin.sellIn, itemAfterUpdate.sellIn);
                    assertEquals(itemOrigin.quality, itemAfterUpdate.quality);
                }
            }

           //Test du 50 eme Jour
            if(i == 50) {
                System.out.println("-------- day " + i + " --------");
                System.out.println("name, sellIn, quality");
                Item[] itemsTest = new Item[] {
                        new Item("+5 Dexterity Vest", -40, 0), //
                        new Item("Aged Brie", -48, 50), //
                        new Item("Elixir of the Mongoose", -45, 0), //
                        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -35, 0),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -40, 0),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -45, 0),
                        // this conjured item does not work properly yet
                        new Item("Conjured Mana Cake", -47, 0) };

                for(int j = 0 ; j < items.length ; j++ ) {
                    Item itemOrigin = items[j];
                    Item itemAfterUpdate = itemsTest[j];
                    System.out.println(itemAfterUpdate.name+","+itemAfterUpdate.sellIn+","+itemAfterUpdate.quality);
                    assertEquals(itemOrigin.name, itemAfterUpdate.name);
                    assertEquals(itemOrigin.sellIn, itemAfterUpdate.sellIn);
                    assertEquals(itemOrigin.quality, itemAfterUpdate.quality);
                }
            }

            //Test du 99 eme Jour
            if(i == 99) {
                System.out.println("-------- day " + i + " --------");
                System.out.println("name, sellIn, quality");
                Item[] itemsTest = new Item[] {
                        new Item("+5 Dexterity Vest", -89, 0), //
                        new Item("Aged Brie", -97, 50), //
                        new Item("Elixir of the Mongoose", -94, 0), //
                        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -84, 0),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -89, 0),
                        new Item("Backstage passes to a TAFKAL80ETC concert", -94, 0),
                        // this conjured item does not work properly yet
                        new Item("Conjured Mana Cake", -96, 0) };

                for(int j = 0 ; j < items.length ; j++ ) {
                    Item itemOrigin = items[j];
                    Item itemAfterUpdate = itemsTest[j];
                    System.out.println(itemAfterUpdate.name+","+itemAfterUpdate.sellIn+","+itemAfterUpdate.quality);
                    assertEquals(itemOrigin.name, itemAfterUpdate.name);
                    assertEquals(itemOrigin.sellIn, itemAfterUpdate.sellIn);
                    assertEquals(itemOrigin.quality, itemAfterUpdate.quality);
                }
            }

            sparklingCup.updateQuality();
        }
    }
}
