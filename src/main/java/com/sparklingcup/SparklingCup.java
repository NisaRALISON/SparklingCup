package com.sparklingcup;

/**
 * This is the service to treat all Sparkling Cup
 */
public class SparklingCup {
    Item[] items;
    UpdaterRegistry updaterRegistry;

    public SparklingCup(Item[] items) {
        this.items = items;
    }

    public SparklingCup(Item[] items,UpdaterRegistry updaterRegistry) {
        this.items = items;
        this.updaterRegistry = updaterRegistry;
    }

    /**
     * This is the method which update quality for all sparkling cup
     */
    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = updaterRegistry.getUpdater(item.name);
            updater.update(item);
        }
    }
}