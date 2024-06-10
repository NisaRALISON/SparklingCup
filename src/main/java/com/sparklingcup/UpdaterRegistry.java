package com.sparklingcup;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is about all Sparkling Cup
 */
public class UpdaterRegistry {
    private final Map<String, ItemUpdater> updaters = new HashMap<>();

    /**
     * Constructor to insert all Sparkling cup
     */
    public UpdaterRegistry() {
        registerUpdater("Aged Brie", new AgedBrieUpdater());
        registerUpdater("Backstage passes to a TAFKAL80ETC concert", new BackstagePassUpdater());
        registerUpdater("Sulfuras, Hand of Ragnaros", new SulfurasUpdater());
        registerUpdater("Conjured Mana Cake", new ConjuredItemUpdater());
    }

    /**
     * This method is used to insert a new Sparkling cup
     * @param itemName Sparkling cup name
     * @param itemUpdater Corresponding class sparkling cup
     */
    public void registerUpdater(String itemName,ItemUpdater itemUpdater) {
        updaters.put(itemName,itemUpdater);
    }

    /**
     * This method is used to get the Corresponding class sparkling cup class
     * If the cup is not into the List, the class by default to treat sparkling cup is used
     * @param itemName sparkling cup name
     * @return the ItemUpdater corresponding
     */
    public ItemUpdater getUpdater(String itemName) {
        return updaters.getOrDefault(itemName, new DefaultItemUpdater());
    }
}
