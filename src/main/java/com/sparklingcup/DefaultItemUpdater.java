package com.sparklingcup;

/**
 * This is to treat Item by default if it is not into the registry
 */
public class DefaultItemUpdater implements ItemUpdater{
    /**
     * This method is used to update quality for Item which not into registry
     * @param item to update
     */
    @Override
    public void update(Item item) {
        //Comme quality ne peut jamais être négatif, on va le remettre à 0 si c'est nagatif à l'entrée
        if(item.quality < 0 ) {
            item.quality = 0 ;
        }
        if(item.quality > 0) {
            item.quality-- ;
        }
        item.sellIn-- ;
        //Une fois que la date de péremption est passée, la qualité se dégrade deux fois plus rapidement.
        //Quality ne doit pas être négatif
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality-- ;
        }
    }
}
